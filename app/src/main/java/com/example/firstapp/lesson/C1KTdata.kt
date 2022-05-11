package com.example.firstapp.lesson

class C1KTdata {
}

// 1.基本数据类型
fun main() {
    // 1. 整型 int
    val number = 100
    // 2. long(自动推断类型)
    val bigNumber = 8000000000
    // 3. byte 指定类型
    val byteNumber:Byte = 1
    // 4. 浮点型 double(默认)、float(超过长度会四舍五入)
    val doubleNumber = 3.14159266666
    val floatNumber = 3.14159266666f

    println("a=" + floatNumber)
    println("a=$doubleNumber")

    // 5.字符类型
    val char:Char = '0'
    // 6.布尔类型
    val isTrue = true
    // 7.字符串
    val str = "123456"
    val str1 = str[1] // 访问字符串

    // 字符串的模版表达式 $
    println("the result is $str")
    println("text length is ${str.length}")
    // 转义符号\
    val helloworld3 = "{\"key\":\"value\"}"
    println(helloworld3)
    // 分界符 """(不需要转义符号)

    // 数据类型的强制转换
    val num1 = 100
    val toString = num1.toString()

    // 位运算
    val b1 = true
    val b2 = false
    val and = b1.and(b2)
    println(and)

}