package the.alley.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class UserDB {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;// test
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