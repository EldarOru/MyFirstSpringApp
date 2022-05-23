package com.example.testspringapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TestSpringAppApplication

fun main(args: Array<String>) {
    runApplication<TestSpringAppApplication>(*args)
}
