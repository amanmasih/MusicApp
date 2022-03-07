package niit.trackrecommender.Service;

import niit.trackrecommender.Domain.Tracks;
import niit.trackrecommender.Respository.TrackRepository;
import niit.trackrecommender.exception.TrackAlreadyExist;
import niit.trackrecommender.exception.TrackNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackServiceImpl implements TrackService{

    private TrackRepository trackRepository;

    @Autowired
    public TrackServiceImpl(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    //add the track
    @Override
    public Tracks saveTrack(Tracks track) throws TrackAlreadyExist {
        if(trackRepository.findById(track.getTrackId()).isPresent()){
                throw new TrackAlreadyExist();
        }
        return trackRepository.save(track);
    }

    //recommend the track of artists
    @Override
    public List<Tracks> recommendArtist(String artistName) throws TrackNotFound {
    return trackRepository.recommendedArtist(artistName);
    }

    //recommend all the available tracks
    @Override
    public List<Tracks> allRecommendedTracks() throws TrackNotFound {
        return (List<Tracks>)trackRepository.findAll();
    }
}//end of class
