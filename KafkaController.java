package com.example.kafka_demo.controller;

import com.example.kafka_demo.producer.KafkaProducer;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;


@RestController
@RequestMapping("/api/kafka")
public class KafkaController {
    private final KafkaProducer kafkaProducer;

    public KafkaController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping(value = "/send", consumes = MediaType.TEXT_PLAIN_VALUE)
    public String sendMessage(@RequestBody String message) {
        kafkaProducer.sendMessage("test-topic", message);
        return "Message sent: " + message;
    }
}

