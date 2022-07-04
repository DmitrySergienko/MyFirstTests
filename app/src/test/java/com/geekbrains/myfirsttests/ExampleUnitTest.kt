package com.geekbrains.myfirsttests

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}


class Test{
    lateinit var a: A

    @Before
    fun setUp(){
        a = A()
    }
    @Test
    fun test(){
        val hello = a.hello()
        Assert.assertEquals("World2",hello)
    }
}

class A{
    fun hello() = "World2"

}
