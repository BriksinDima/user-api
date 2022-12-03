package me.bdv.user.api.producer;

import lombok.RequiredArgsConstructor;
import me.bdv.user.api.dto.UserDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserProducer {

    @Value("${kafka.topic.userCash}")
    private String topic;

    private final KafkaTemplate<String, UserDto> kafkaTemplate;

    public void createCashUser(UserDto userDto){
        kafkaTemplate.send(topic, userDto);
    }

}
