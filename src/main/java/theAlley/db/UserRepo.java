package theAlley.db;

import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserDB, Integer> {
    UserDB findByName(String name);
}