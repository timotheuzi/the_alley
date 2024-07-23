package the.alley.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

//map tables
@Data
@Entity
@Table(name = "map")
public class MapDB {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String description;
	private Integer items;
	private Integer npcs;
	private Integer users;
}