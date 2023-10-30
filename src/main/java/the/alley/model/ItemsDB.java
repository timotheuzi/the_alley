package the.alley.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

//item table
@Getter
@Setter
@Document
@Table(name = "items")
public class ItemsDB {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private Integer attack;
	private Integer defense;

}