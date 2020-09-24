package org.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class SpringBootApp {
}

@RestController
class PortalController {
    @GetMapping("/")
    fun index() = "Hello World!"
}

fun main(args: Array<String>) {
    runApplication<SpringBootApp>(*args)
}
