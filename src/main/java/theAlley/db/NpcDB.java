package theAlley.db;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//for NPC generation
@Entity
@Data
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