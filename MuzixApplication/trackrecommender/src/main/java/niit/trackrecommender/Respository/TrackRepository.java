package niit.trackrecommender.Respository;

import niit.trackrecommender.Domain.Tracks;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepository extends MongoRepository<Tracks,Integer> {
    @Query("{'artist.artistName':{$in :[?0]}}}")
    List<Tracks> recommendedArtist(String artistName);
}
