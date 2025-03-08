package org.ward.kakfademo.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * To consume messages, we need to configure a ConsumerFactory and a KafkaListenerContainerFactory.
 * Once these beans are available in the Spring Bean factory,
 * POJO-based consumers can be configured using @KafkaListener annotation.
 *
 * group-id: Can be used to create a cluster structure.
 * When you want to run more than one Consumer application in the same cluster,
 * you must give the application the same group-id.
 */

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "${spring.kafka.consumer.topic.name}", groupId = "${spring.kafka.group-id}")
    public void consume(String message, @Headers Map<String, Object> headers) {
        System.out.println("Consumed message:" + message);
    }

    /*
       An example of retrieving information from the headers

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.group-id}")
    public void listen(String message, @Headers Map<String, Object> headers) {
        System.out.println("Received message: " + message + " offset=" + headers.get("RECEIVED_PARTITION_ID"));

        headers.forEach((key, value) -> System.out.println(key + ": " + value));
    }

     */
}
