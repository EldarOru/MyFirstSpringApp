package com.example.testspringapp.controllers

import com.example.testspringapp.entities.Subjects
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CheckController {

    @GetMapping("/")
    fun getHomepage() = listOf(
        Subjects("Kotlin", "Success"),
        Subjects("C++", "In progress"),
        Subjects("Android SDK", "Success"),
        Subjects("Spring", "Just started"),
    )
}