package com.grushevskyi.kafka_spring_example.producer

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class MessageProducer(private val kafkaTemplate: KafkaTemplate<String, String>) {
    fun send(message: String) {
        kafkaTemplate.send("example-topic", message)
    }
}