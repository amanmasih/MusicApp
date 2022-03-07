package niit.trackrecommender.Domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Tracks {
    @Id
    private int trackId;
    private  String trackName;
    private String trackDuration;
    private Artist artist;
}
