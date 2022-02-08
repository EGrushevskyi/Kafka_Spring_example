package com.grushevskyi.kafka_spring_example.controller

import com.grushevskyi.kafka_spring_example.producer.MessageProducer
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class MessageController(val messageProducer: MessageProducer) {

    @PostMapping("/message")
    fun publish(@RequestBody message: String) {
        messageProducer.send(message)
    }

}