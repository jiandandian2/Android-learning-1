package com.example.firstapp.lesson

import org.json.JSONObject

class C2Array {
}
// 2.数组
fun main(){
    // 1.数组 arrayOf创建
    val arrayNumber: Array<Int> = arrayOf(1,2,3,4)
    val arrayObjects = arrayOf(1, true, "2")
    println(arrayNumber)
    println(arrayObjects)

    // 2.空数组 arrayOfNulls
    val arrayOfNulls = arrayOfNulls<String>(5)
    arrayOfNulls[0] = "a"

    // 3.动态创建数组 lambda表达式
    val array = Array(5) { i -> (i * i).toString() }
    // IntArray {100,100,100,100,100}
    val intArray = IntArray(5) { 100 }

    // 4.for循环遍历
    // (1)元素遍历 array.for
    for (s in array) {
        println(s)
    }
    // (2)索引遍历 array.indices.for
    for (i in array.indices) {
        println(i.toString() + "->" + array[i])
    }
    // (3)同时遍历索引和元素 array.withIndex().for
    for ((index,value) in array.withIndex()) {
        println("$index,$value")
    }
    // foreach it是数组内元素
    array.forEach {
        println("$it")
    }
    // 增强foreach，lambda表达式
    array.forEachIndexed { index, s ->
        println("$index,$s")
    }

}