package com.testsmirk

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

val fibonacci = sequence {
    yield(1)
    var cur = 1
    var next = 1
    while (true){
        yield(next)
        val tmp = cur+next
        cur = next
        next = tmp
    }
}
fun main(args: Array<String>) {
    fibonacci.take(1000).iterator().forEach {
        print("$it ")
    }
}