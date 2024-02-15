package the.alley.model;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface UserRepo extends ReactiveCrudRepository<UserDB, Integer> {
	Flux<UserDB> findByName(String name);
	Flux<UserDB> findByLocation(Integer location);
}