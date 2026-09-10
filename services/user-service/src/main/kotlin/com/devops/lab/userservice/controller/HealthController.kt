package com.devops.lab.userservice.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController {

    @GetMapping("/health")
    fun health(): Map<String, String> {
        println("Healt check recibido")

        return mapOf(
            "status" to "UP",
            "service" to "user-service"
        )
    }
}