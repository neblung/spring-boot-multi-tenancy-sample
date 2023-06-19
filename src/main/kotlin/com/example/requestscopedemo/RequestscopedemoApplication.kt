package com.example.requestscopedemo

import com.example.requestscopedemo.TenantContext.currentTenant
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.context.annotation.RequestScope
import java.io.File

@SpringBootApplication
class RequestscopedemoApplication {
    @Bean
    @RequestScope
    fun provideMandantenFileConfig(
        @Value("\${messages.directory}") messagesDirectory: String,
    ): MandantenFileConfig {
        val mandant = currentTenant
        val root = File(messagesDirectory)
        return DefaultMandantenFileConfig(root, mandant)
    }
}

fun main(args: Array<String>) {
    runApplication<RequestscopedemoApplication>(*args)
}

