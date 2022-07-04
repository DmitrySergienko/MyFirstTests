package com.geekbrains.myfirsttests

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

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
    lateinit var testClass: TestClass

   @Before
   fun setUp(){
       testClass = TestClass()
   }

    @Test
    fun testEquals(){
        val sum = testClass.sumCalculation(2,3)
        assertEquals("testEquals",5,sum)

    }
    @Test
    fun testNotEquals(){
        val sum = testClass.sumCalculation(2,3)
        assertNotEquals("testNotEquals",5,sum)
    }
    @Test
    fun testArrayEquals(){
        val myArray = testClass.arrayCalculation(1,2,3)
        val myArray2 = arrayOf(1,2,3)
        assertArrayEquals(myArray,myArray2)
    }
    @Test
    fun testAssertNull(){
        val param = testClass.someTestForNull()
        assertNull("should be null",param)
    }
    @Test
    fun testAssertNotNull(){
        val param = testClass.sumCalculation(1,2)
        assertNotNull("should be not null",param)
    }
    @Test
    fun testSameObject(){
        val someTestObject = mySingleObject.returnMyObject()
        assertSame("should be single object only",someTestObject,someTestObject)
    }
}
