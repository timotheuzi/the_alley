package the.alley.model;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface CacheRepo extends ReactiveCrudRepository<CacheDB, Integer> {
	Mono<CacheDB> findById(int intValue);
}