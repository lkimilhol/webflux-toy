package com.lkimilhol.webfluxtoy.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
class TestController {
    @GetMapping("/flux")
    fun helloFlux(): Flux<String>? {
        return Flux.just("Hello", "World")
    }

    @GetMapping("/mono")
    fun helloMono(): Mono<String>? {
        return Mono.just("Hello")
    }
}