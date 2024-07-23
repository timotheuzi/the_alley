package the.alley.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemsRepo extends CrudRepository<ItemsDB, Integer> {
	//List<ItemsDB> findById(String id);

	//todo add custom query
	//@Query("SELECT * FROM items where name = :name")
	//Optional selectByName(@Param("name") String name);
}