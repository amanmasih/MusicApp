package niit.trackrecommender.Respository;

import niit.trackrecommender.Domain.Tracks;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepository extends MongoRepository<Tracks,Integer> {
    List<Tracks> recommendedArtist(String artistName);
}
