package com.geekbrains.myfirsttests

class TestClass {

        fun sumCalculation(a: Int,b:Int) = a+b

        fun arrayCalculation(a: Int, b: Int, c: Int): Array<Int> {
                return arrayOf(a, b, c)
        }
        fun someTestForNull() = null



}
object mySingleObject {
        fun returnMyObject() = String
}