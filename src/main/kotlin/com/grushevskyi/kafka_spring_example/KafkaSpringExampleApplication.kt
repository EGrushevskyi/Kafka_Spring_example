package com.grushevskyi.kafka_spring_example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka

@SpringBootApplication
@EnableKafka
@EnableConfigurationProperties
class KafkaSpringExampleApplication

fun main(args: Array<String>) {
	runApplication<KafkaSpringExampleApplication>(*args)
}
