package net.joshuabrandes.datageneratorpgsql.db;

import net.joshuabrandes.datageneratorpgsql.model.entity.Item;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

import java.time.LocalDateTime;

public interface ItemRepository extends ReactiveCrudRepository<Item, Long> {

    // Flux<Item> getAllByCreatedAtAfter(LocalDateTime createdAtAfter);
}
