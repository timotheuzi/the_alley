package the.alley.db;

import org.springframework.data.repository.CrudRepository;


public interface CacheRepo extends CrudRepository<CacheDB, Integer> {
	CacheDB findById(int intValue);
}