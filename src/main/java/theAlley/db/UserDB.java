package theAlley.db;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "users")
public class UserDB {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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