package theAlley.db;

import org.springframework.data.repository.CrudRepository;

public interface MapRepo extends CrudRepository<MapDB, Integer> {
    //List<MapDB> findByName(String name);
}