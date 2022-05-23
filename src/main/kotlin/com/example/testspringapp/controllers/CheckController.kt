package com.example.testspringapp.controllers

import com.example.testspringapp.entities.Knowledge
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CheckController {

    @GetMapping("/")
    fun getHomepage() = listOf(
        Knowledge("Kotlin", "Success"),
        Knowledge("C++", "In progress"),
        Knowledge("Android SDK", "Success"),
        Knowledge("Spring", "Just started"),
    )
}