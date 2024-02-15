package the.alley.model;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

//import com.darkness.db.mapDB;

public interface MapRepo extends ReactiveCrudRepository<MapDB, Integer> {
	 Flux<MapDB> findByName(String name);

	// Optional<mapDB> findById(Integer intValue);
}