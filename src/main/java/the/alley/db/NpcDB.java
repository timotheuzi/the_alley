package the.alley.db;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

//for NPC generation

@Getter
@Setter
@Document
@Table(name = "npc")
public class NpcDB {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private String description;
	private Integer attack;
	private Integer defense;
	private Integer location;
	private Integer hp;

}