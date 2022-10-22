package com.shahroz.kmmpg

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Greeting {
    private val client = HttpClient()

    var result = ""

    init {
        GlobalScope.launch {
            result = greeting()
        }
    }

    private suspend fun greeting(): String {
        val response = client.get("https://ktor.io/docs/")
        return response.bodyAsText()
    }
}