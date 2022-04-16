package com.belveth.bullettime

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BulletTimeApplication

fun main(args: Array<String>) {
	runApplication<BulletTimeApplication>(*args)
}
