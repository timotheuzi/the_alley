package the.alley.model;

import lombok.Data;
import javax.persistence.*;


//item table
@Data
@Entity
@Table(name = "cache")
public class CacheDB {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String mapName;
	private String currentRoomStatus;
}