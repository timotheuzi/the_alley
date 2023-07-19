package the.alley.db;

import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserDB, Integer> {
	UserDB findByName(String name);
	UserDB findByLocation(Integer location);
}