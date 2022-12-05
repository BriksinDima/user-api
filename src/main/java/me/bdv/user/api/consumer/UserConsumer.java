package me.bdv.user.api.consumer;

import me.bdv.user.api.dto.UserDto;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class UserConsumer {

    @KafkaListener(topics = "user-cash")
    public void consume(UserDto user) {
        System.out.println("Received message: " + user);
    }
}
