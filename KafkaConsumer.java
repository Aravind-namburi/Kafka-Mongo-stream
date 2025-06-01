package com.example.kafka_demo.consumer;

import com.example.kafka_demo.model.Message;
import com.example.kafka_demo.repository.MessageRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private final MessageRepository messageRepository;

    public KafkaConsumer(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @KafkaListener(topics = "test-topic", groupId = "my-group")
    public void listen(String message) {
        System.out.println("Received: " + message);

        // Save message to MongoDB
        Message msg = new Message(message);
        messageRepository.save(msg);
        System.out.println("Saved to MongoDB: " + message);
    }
}
