package niit.trackrecommender.Config;

import niit.trackrecommender.Domain.Artist;
import niit.trackrecommender.Domain.Image;
import niit.trackrecommender.Domain.Tracks;

import niit.trackrecommender.Service.TrackServiceImpl;
import niit.trackrecommender.exception.TrackAlreadyExist;

import niit.trackrecommender.rabbitmq.TrackDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @Autowired
    private TrackServiceImpl trackService;

    //queue name what is defined in configuration of movieService
    @RabbitListener(queues="track_queue")
    public void getTrackDTOFromRabbitMq(TrackDTO trackDTO)throws TrackAlreadyExist {
        Image image =new Image(trackDTO.getArtist().getImage().getImageId(),trackDTO.getArtist().getImage().getImageName());
        Artist artist = new Artist(trackDTO.getArtist().getArtistName(),trackDTO.getArtist().getArtistGender(),image);
        Tracks track =new Tracks(trackDTO.getTrackId(),trackDTO.getTrackName(),trackDTO.getTrackDuration(),artist);
        trackService.saveTrack(track);
    }//end of the function
}//end of the class
