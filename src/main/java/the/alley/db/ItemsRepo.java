package the.alley.db;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface ItemsRepo extends ReactiveCrudRepository<ItemsDB, Integer> {
	Mono<ItemsDB> findById(String id);

	//todo add custom query
	//@Query("SELECT * FROM items where name = :name")
	//Optional selectByName(@Param("name") String name);
}