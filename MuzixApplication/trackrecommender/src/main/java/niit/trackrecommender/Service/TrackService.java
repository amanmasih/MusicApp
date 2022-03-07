package niit.trackrecommender.Service;

import niit.trackrecommender.Domain.Artist;
import niit.trackrecommender.Domain.Tracks;
import niit.trackrecommender.exception.TrackAlreadyExist;
import niit.trackrecommender.exception.TrackNotFound;

import java.util.List;

public interface TrackService {
    Tracks saveTrack(Tracks track) throws TrackAlreadyExist;
    List<Tracks> recommendArtist( String artistName) throws TrackNotFound;
    List<Tracks> allRecommendedTracks() throws TrackNotFound;
}
