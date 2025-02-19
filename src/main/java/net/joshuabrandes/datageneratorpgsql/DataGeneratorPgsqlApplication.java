package net.joshuabrandes.datageneratorpgsql;

import net.joshuabrandes.datageneratorpgsql.service.ItemGenerationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.util.Objects;

@SpringBootApplication
public class DataGeneratorPgsqlApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(DataGeneratorPgsqlApplication.class);

    private final ItemGenerationService itemGenerationService;
    private final Environment env;

    public DataGeneratorPgsqlApplication(ItemGenerationService itemGenerationService, Environment env) {
        this.itemGenerationService = itemGenerationService;
        this.env = env;
    }

    public static void main(String[] args) {
        SpringApplication.run(DataGeneratorPgsqlApplication.class, args);
        log.info("Application finished");
    }

    @Override
    public void run(String... args) throws Exception {
        logProperties();
        log.info("");

        log.info("Welcome to the item generation application!");
        while (true) {
            System.out.println("Enter the number of items to generate (if less than 1, the database will be erased; info will return number of items in db; exit to exit):");
            var input = System.console().readLine();
            if (Objects.equals(input, "info")) {
                log.info("Number of items in database: {}", itemGenerationService.getAllItems().count().block());
                continue;
            } else if (Objects.equals(input, "exit")) {
                return;
            }

            var numberOfItems = Integer.parseInt(input);

            if (numberOfItems < 1) {
                log.info("Clearing database");
                itemGenerationService.clearDB().block();
            } else {
                var items = itemGenerationService.generateAndInsertItems(numberOfItems)
                        .collectList()
                        .block();
                log.info("Generated {} items", items.size());
            }
        }
    }

    private void logProperties() {
        System.out.println("spring.r2dbc.url: " + env.getProperty("spring.r2dbc.url"));
        System.out.println("spring.r2dbc.username: " + env.getProperty("spring.r2dbc.username"));
        System.out.println("spring.r2dbc.password: " + env.getProperty("spring.r2dbc.password"));
        System.out.println("spring.data.jdbc.dialect: " + env.getProperty("spring.data.jdbc.dialect"));
    }
}
