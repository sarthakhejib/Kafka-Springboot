package com.kafka-springboot.project;

import com.kafka-springboot.project.kafka.batchlistener.BatchMessageConsumingExample;
import com.kafka-springboot.project.kafka.multipartition.MultiPartitionMessagingExample;
import com.kafka-springboot.project.kafka.simplemessage.SimpleKafkaMessagingExample;
import com.kafka-springboot.project.kafka.streamapi.KafkaStreamExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

	/*
	 * @Autowired private SimpleKafkaMessagingExample simpleKafkaMessagingExample;
	 * 
	 * @Autowired private MultiPartitionMessagingExample
	 * multiPartitionMessagingExample;
	 * 
	 * @Autowired private BatchMessageConsumingExample batchMessageConsumingExample;
	 * 
	 * @Autowired private KafkaStreamExample kafkaStreamExample;
	 */

    @Bean
    @Profile("!test")
    public CommandLineRunner batchMessageConsumerRunner() {
        return args -> {
            //simpleKafkaMessagingExample.execute();
            //multiPartitionMessagingExample.execute();
            //batchMessageConsumingExample.execute();
            //kafkaStreamExample.execute();
        };
    }
}