package com.grushevskyi.kafka_spring_example.consumer

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class MessageConsumer {

    @KafkaListener(topics = ["example-topic"])
    fun processMessage(message: String) {

    }
}