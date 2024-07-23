package the.alley.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NpcRepo extends CrudRepository<NpcDB, Integer> {
	//List<NpcDB> findByName(String name);
	//NpcDB findByLocation(Integer location);
}