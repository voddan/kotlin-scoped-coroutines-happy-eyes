package exaples.coroutine.guide

import kotlinx.coroutines.experimental.GlobalScope
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    fun main() {
        GlobalScope.launch {
            delay(1000L)
            println("World!")
        }
        println("Hello,")
        Thread.sleep(2000L)
    }
}