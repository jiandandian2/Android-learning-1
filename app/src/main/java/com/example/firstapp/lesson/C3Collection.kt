package com.example.firstapp.lesson

import androidx.collection.arrayMapOf

class C3Collection {
}

// 3.集合： list、set、map
fun main(){
    // 1.list
    // (1)创建可变列表 mutableListOf
    val arrayList = mutableListOf<String>()
    arrayList.add("a")
    val arrayList1 = mutableListOf<String>("a","b")
    // (2)不可变列表 listOf
    val arrayInt = listOf<Int>(1, 2, 3)
    println(arrayInt)

    // 2.map
    // (1)可变map mutableMapOf、arrayMapOf
    val arrayMap = mutableMapOf<String, String>()
    arrayMap["a"] = "1"
    arrayMap.put("b","2")
    println(arrayMap)
    val arrayMap1 = arrayMapOf(Pair("b", "2"))
    arrayMap1["c"] = "3"
    println(arrayMap1)
    // (2)不可变map mapOf
    val arrayMap2 = mapOf<String, String>(Pair("d", "4"))
    println(arrayMap2)

    // 3.set
    // (1)可变集合
    val arraySet = mutableSetOf<Int>()
    arraySet.add(1)
    arraySet.add(2)
    arraySet.add(3)
    arraySet.add(3)
    arraySet.add(4)
    for (i in arraySet) {
        println(i)
    }
    // (2)不可变集合 setOf
    val set1 = setOf<Int>(1, 2, 3, 4, 5, 6)
    set1.isEmpty()
    set1.contains(3)


}