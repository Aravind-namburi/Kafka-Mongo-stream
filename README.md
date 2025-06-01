# KafkaMongoStream

A Spring Boot application that demonstrates real-time message streaming using Apache Kafka and persistence using MongoDB. The application includes a RESTful API for producing messages, a Kafka consumer for processing, and a MongoDB repository for storing incoming messages.

---

## Project Summary

**KafkaMongoStream** is a lightweight microservice that enables asynchronous message communication using Apache Kafka. It allows clients to send plain text messages via HTTP POST, which are then:
- Published to a Kafka topic (`test-topic`)
- Consumed by a Kafka listener
- Stored into a MongoDB collection for persistence and later analysis

This project is ideal for understanding event-driven architecture, stream processing, and integration of Spring Boot with Kafka and MongoDB.

---

## Features

- ✅ REST endpoint to publish messages to Kafka
- ✅ Kafka consumer to read messages from topic
- ✅ Message persistence using MongoDB
- ✅ Uses Spring Boot for configuration and dependency management
- ✅ Minimal setup with plug-and-play components

---

## Tech Stack

- **Java 17+**
- **Spring Boot**
- **Apache Kafka**
- **MongoDB**
- **Spring Kafka**
- **Spring Data MongoDB**

---

## Setup Instructions

### Prerequisites
- Kafka and Zookeeper running locally or via Docker
- MongoDB running locally or via Docker
- Java 17+
- Maven

### Build and Run

```bash
# Clone the repository
git clone https://github.com/Aravind-namburi/KafkaMongoStream.git
cd KafkaMongoStream

# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
```

---

## API Usage

### Send a Message

**POST** `/api/kafka/send`

**Body (text/plain):**
```
Hello Kafka World!
```

**Response:**
```
Message sent: Hello Kafka World!
```

---

## MongoDB Document Example

```json
{
  "_id": "6656fc4db4f6e43b3a0c67f2",
  "content": "Hello Kafka World!"
}
```

Messages are stored in the `messages` collection.

---

## Project Structure

- `KafkaProducer.java`: Sends messages to Kafka topic
- `KafkaConsumer.java`: Listens to Kafka and stores to MongoDB
- `KafkaController.java`: Exposes the REST API
- `Message.java`: MongoDB document model
- `MessageRepository.java`: Mongo repository interface
- `KafkaDemoApplication.java`: Main entry point

---

## Author

- **Aravind Namburi**
---
