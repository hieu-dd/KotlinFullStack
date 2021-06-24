package com.example.server

import com.example.domain.Main.testDomain
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ServerController {
    @GetMapping("/")
    fun all(): String {
        return testDomain()
    }
}