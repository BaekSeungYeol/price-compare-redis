package me.whitewin.pricecompareredis

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PriceCompareRedisApplication

fun main(args: Array<String>) {
    runApplication<PriceCompareRedisApplication>(*args)
}
