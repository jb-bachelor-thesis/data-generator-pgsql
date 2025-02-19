package net.joshuabrandes.datageneratorpgsql.service;

import net.joshuabrandes.datageneratorpgsql.db.ItemRepository;
import net.joshuabrandes.datageneratorpgsql.model.entity.Item;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@Service
public class ItemGenerationService {

    private final ItemRepository itemRepository;

    public ItemGenerationService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Flux<Item> generateAndInsertItems(int numberOfItems) {
        return itemRepository.saveAll(
                Flux.range(1, numberOfItems)
                        .parallel()
                        .runOn(Schedulers.parallel())
                        .map(_ -> RandomizerUtil.getRandomItem())
        );
    }

    public Mono<Void> clearDB() {
        return itemRepository.deleteAll();
    }

    public Flux<Item> getAllItems() {
        return itemRepository.findAll();
    }
}
