package com.flash.oraculo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class OraculoApplication

fun main(args: Array<String>) {
    runApplication<OraculoApplication>(*args)
}
