package me.kalriz.messanger.component;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class Producer {
	
	@Async
	public void Send(String topic, String payload)
	{
		Properties configs = new Properties();
        configs.put("bootstrap.servers", "xym0.kalee.land:9092");
        configs.put("acks", "all");
        configs.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        configs.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        KafkaProducer<String, String> producer = new KafkaProducer<String, String>(configs);

        for (int i = 0; i < 5; i++) {
            String message = "hello " + i;
            producer.send(new ProducerRecord<String, String>("kalee-event", message));
        }

        producer.flush();
        producer.close();
	}
}
