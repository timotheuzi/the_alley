package the.alley.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

//map tables

@Getter
@Setter
@Document
@Table(name = "map")
public class MapDB {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private Integer items;
	private Integer npcs;
	private Integer users;
}