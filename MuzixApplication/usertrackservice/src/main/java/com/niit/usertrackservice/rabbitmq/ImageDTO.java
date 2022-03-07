package com.niit.usertrackservice.rabbitmq;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ImageDTO {
    private int imageId;
    private String imageName;
}
