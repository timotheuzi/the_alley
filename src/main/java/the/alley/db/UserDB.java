package the.alley.db;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
//user objects

@Getter
@Setter
@Document
@Table(name = "users")
public class UserDB {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;// test
	private String name;
	private Integer lvl;
	private Integer money;
	private Integer exp;
	private Integer attack;
	private Integer defense;
	private String description;
	private Integer location;
	private Integer hp;

}