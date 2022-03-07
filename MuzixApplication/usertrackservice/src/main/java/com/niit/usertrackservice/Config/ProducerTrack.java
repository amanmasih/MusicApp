package com.niit.usertrackservice.Config;

import com.niit.usertrackservice.rabbitmq.TrackDTO;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProducerTrack {
    private RabbitTemplate rabbitTemplate;
    private DirectExchange exchange;

    @Autowired
    public ProducerTrack(RabbitTemplate rabbitTemplate, DirectExchange exchange) {
        this.rabbitTemplate = rabbitTemplate;
        this.exchange = exchange;
    }

    public void sendMessage(TrackDTO trackDTO){
        //covert the (exchange,routing key,object)
        rabbitTemplate.convertAndSend(exchange.getName(),"track_routing",trackDTO);
    }//end of function
}//end of class
