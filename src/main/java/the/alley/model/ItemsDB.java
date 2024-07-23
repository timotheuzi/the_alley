package the.alley.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//item table
@Data
@Entity
@Table(name = "items")
public class ItemsDB {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String description;
	private Integer attack;
	private Integer defense;

}