package the.alley.db;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface NpcRepo extends ReactiveCrudRepository<NpcDB, Integer> {
	Mono<NpcDB> findByName(String name);
	NpcDB findByLocation(Integer location);
}