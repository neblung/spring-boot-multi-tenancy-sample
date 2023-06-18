package com.example.requestscopedemo

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.io.File

@SpringBootApplication
class RequestscopedemoApplication {
    @Bean
    fun provideMandatenFileConfig(
        @Value("\${messages.directory}") messagesDirectory: String,
    ): MandantenFileConfig {
        val root = File(messagesDirectory)
        return DefaultMandantenFileConfig(root)
    }
}

fun main(args: Array<String>) {
    runApplication<RequestscopedemoApplication>(*args)
}

