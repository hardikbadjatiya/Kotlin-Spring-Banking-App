package com.amex.customerapi

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
@OpenAPIDefinition(info = Info(title = "Customer API", version = "1.0",  description = "Customer Information"))
@SpringBootApplication
class CustomerapiApplication

fun main(args: Array<String>) {
    runApplication<CustomerapiApplication>(*args)
}
