package com.example.springrabbitmqproducer.controller;

import com.example.springrabbitmqproducer.model.Clientewmsc;
import com.example.springrabbitmqproducer.model.Message;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.MessageDeliveryMode;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Producer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private DirectExchange exchange;

    @PostMapping("/postA")
    public String sendA(@RequestBody Message message){
        rabbitTemplate.convertAndSend(exchange.getName(), "routing.A", message, message1 ->
        {
            message1.getMessageProperties().setDeliveryMode(MessageDeliveryMode.PERSISTENT);
            return message1;
        });
        return "Message send successfully A";
    }


    @PostMapping("/cliente")
    public String sendCliente(@RequestBody Clientewmsc clientewmsc){
        rabbitTemplate.convertAndSend(exchange.getName(), "routing.A", clientewmsc, message1 ->
        {
            message1.getMessageProperties().setDeliveryMode(MessageDeliveryMode.PERSISTENT);
            return message1;
        });
        return "Message send successfully A";
    }

    @PostMapping("/postB")
    public String sendB(@RequestBody Message message){
        rabbitTemplate.convertAndSend(exchange.getName(), "routing.B", message);
        return "Message send successfully B";
    }
}
