package the.alley.db;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;


public interface CacheRepo extends ReactiveCrudRepository<CacheDB, Integer> {
	Mono<CacheDB> findById(int intValue);
}