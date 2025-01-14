package net.joshuabrandes.datageneratorpgsql;

import net.joshuabrandes.datageneratorpgsql.service.ItemGenerationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataGeneratorPgsqlApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(DataGeneratorPgsqlApplication.class);

    private final ItemGenerationService itemGenerationService;

    public DataGeneratorPgsqlApplication(ItemGenerationService itemGenerationService) {
        this.itemGenerationService = itemGenerationService;
    }

    public static void main(String[] args) {
        SpringApplication.run(DataGeneratorPgsqlApplication.class, args);
        log.info("Application finished");
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Welcome to the item generation application!");
        System.out.print("Enter the number of items to generate (if less than 1, the database will be erased): ");
        int numberOfItems = Integer.parseInt(System.console().readLine());

        if (numberOfItems < 1) {
            log.info("Clearing database");
            itemGenerationService.clearDB().block();
        } else {
            itemGenerationService.generateAndInsertItems(numberOfItems)
                    .collectList()
                    .subscribe(items -> log.info("Generated {} items", items.size()));
        }
    }
}
