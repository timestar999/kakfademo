# kakfademo
SpringBoot example application with kafka producer, consumer and rest interface via POST request. 

# Rest Interface
Utilising a zookeeper/kafka docker stock, the application runs on port 8081 and accepts POST requests as follows

POST localhost:8081/send
{
    "message": "Hello Kafka Finally"
}

# Based On 
https://seyhmusaydogdu.medium.com/spring-boot-apache-kafka-a2cc1088be8d

# Kafka/Zookeeper 
From the docker directory, run 
`docker-compose up -d`
