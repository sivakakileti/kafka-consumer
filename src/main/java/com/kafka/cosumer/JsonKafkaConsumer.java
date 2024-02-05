package com.kafka.cosumer;

import com.kafka.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JsonKafkaConsumer {

    @KafkaListener(topics = "json-topic-message",groupId = "third-group")
    public void readJsondata(User user){
        System.out.println("Read json data "+user.toString());
    }
}
