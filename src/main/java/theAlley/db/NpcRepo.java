package theAlley.db;

import org.springframework.data.repository.CrudRepository;

public interface NpcRepo extends CrudRepository<NpcDB, Integer> {
    //List<NpcDB> findByName(String name);
    //NpcDB findByLocation(Integer location);
}