package com.belveth.bullettime

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [SecurityAutoConfiguration::class])
class BulletTimeApplication

fun main(args: Array<String>) {
	runApplication<BulletTimeApplication>(*args)
}
