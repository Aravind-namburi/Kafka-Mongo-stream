package com.example.kafka_demo.repository;

import com.example.kafka_demo.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends MongoRepository<Message, String> {
}
// public class MessageRepository {
    
// }
