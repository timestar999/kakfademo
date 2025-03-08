package org.ward.kakfademo.services;

import org.springframework.stereotype.Service;
import org.ward.kakfademo.kafka.KafkaProducer;

@Service
public class MessageProducer {

    private KafkaProducer kafkaProducer;

    public void MessageProducer(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    public void sendMessage(String message) {
        kafkaProducer.sendMessageAsync(message);
    }
}
