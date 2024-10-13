package com.example.powerpuffapp // Certifique-se de que o pacote está correto

object ResponseManager {
    val responses = mutableListOf<String>()

    fun addResponse(response: String, age: String, reason: String) {
        responses.add(response)
    }

    fun getAllResponses(): String {
        return responses.joinToString("\n")
    }
}
