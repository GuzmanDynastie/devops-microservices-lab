package com.devops.lab.userservice.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @GetMapping("/users")
    fun user(): Map<String, Any> {
        println("Users check recibido")

        return mapOf(
            "id" to 1,
            "name" to "Emmanuel"
        )
    }
}