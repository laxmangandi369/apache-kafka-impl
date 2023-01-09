package com.mb.consumer.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
	
	@KafkaListener(topics = "wikimedia_recentchange",
				   groupId = "myGroup")
	public void consumeData(String eventMessage) {
		LOGGER.info(String.format(" consumer message recieved -> %s",eventMessage));
		LOGGER.info("---------------------------------------------------------------------------------------------------------");
	}

}
