package com.lkimilhol.webfluxtoy.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
class RequestController {
    @GetMapping("/{member}")
    fun helloFlux(@PathVariable member: Long): Flux<String>? {
        return Flux.just("Hello", "World")
    }
}