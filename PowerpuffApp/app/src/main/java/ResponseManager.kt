package com.example.powerpuffapp

object ResponseManager {
    val responses = mutableListOf<String>()

    fun addResponse(response: String, age: String, reason: String) {
        responses.add(response)
    }

    fun getAllResponses(): String {
        return responses.joinToString("\n")
    }
}
