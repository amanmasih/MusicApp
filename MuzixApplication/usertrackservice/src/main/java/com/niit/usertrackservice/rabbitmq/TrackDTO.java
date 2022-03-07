package com.niit.usertrackservice.rabbitmq;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TrackDTO {
    private int trackId;
    private  String trackName;
    private String trackDuration;
    private ArtistDTO artist;
}
