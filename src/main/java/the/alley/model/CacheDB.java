package the.alley.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//item table
@Getter
@Setter
@Document
@Table(name = "msg_cache")
public class CacheDB {
	@Id
	@GeneratedValue
	private int id;
	private String mapName;
	private String currentRoomStatus;
}