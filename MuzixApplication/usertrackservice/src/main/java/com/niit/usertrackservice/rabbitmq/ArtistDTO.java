package com.niit.usertrackservice.rabbitmq;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ArtistDTO {
    private String artistName;
    private String artistGender;
    private ImageDTO image;
}
