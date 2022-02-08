package com.grushevskyi.kafka_spring_example.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "custom-configs")
class CustomConfigs {
    var autoStart: Boolean = true
}