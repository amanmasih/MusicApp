package niit.trackrecommender.Controller;

import niit.trackrecommender.Domain.Tracks;
import niit.trackrecommender.Service.TrackServiceImpl;
import niit.trackrecommender.exception.TrackAlreadyExist;
import niit.trackrecommender.exception.TrackNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v3")
public class TrackController {

private TrackServiceImpl trackService;

    @Autowired
    public TrackController(TrackServiceImpl trackService) {
        this.trackService = trackService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerTrack(Tracks track)throws TrackAlreadyExist {
        try{
            return new ResponseEntity<>(trackService.saveTrack(track),HttpStatus.CREATED);
        }
        catch(TrackAlreadyExist e ){throw new TrackAlreadyExist();}
        catch(Exception x){return new ResponseEntity<>("User not registered", HttpStatus.CONFLICT);}
    }

    //fetch the track reccomended on artist name
    @GetMapping("/track/getartistrecommendation/{artistname}")
    public ResponseEntity<?> trackByartist(@PathVariable String artistName)throws TrackNotFound {
        return new ResponseEntity(trackService.recommendArtist(artistName),HttpStatus.FOUND);
    }

    //fetch all the tracks available
    @GetMapping("/track/getalltracks")
    public ResponseEntity<?>getAllTracks()throws TrackNotFound{
        return new ResponseEntity<>(trackService.allRecommendedTracks(),HttpStatus.FOUND);
    }

}//end of the class
