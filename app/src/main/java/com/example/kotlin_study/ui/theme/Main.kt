package com.example.kotlin_study.ui.theme

// 람다식
fun main() {
    lifecycleScope.launch{
        myFunc(10) {
            println("함수 호출")
        }
    }
}

suspend fun myFunce(a: Int, callBack: () -> Unit = {}){
    println("함수시작")
    callBack()
    println("함수끝")
}
