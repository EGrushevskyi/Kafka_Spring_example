package com.grushevskyi.kafka_spring_example.consumer

import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class MessageConsumer {

    private val logger = LoggerFactory.getLogger(javaClass)

    @KafkaListener(
        topics = ["example-topic"],
        groupId = "example-message-consumer",
        autoStartup = "\${custom-configs.auto-start:true}"
    )
    fun processMessage(message: String) {
        logger.info("got message: {}", message)
    }
}