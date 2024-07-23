package the.alley.model;

import lombok.Data;
import javax.persistence.*;

//for NPC generation
@Data
@Entity
@Table(name = "npc")
public class NpcDB {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String description;
	private Integer attack;
	private Integer defense;
	private Integer location;
	private Integer hp;

}