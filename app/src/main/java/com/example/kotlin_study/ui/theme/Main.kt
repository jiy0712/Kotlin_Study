package com.example.kotlin_study.ui.theme

// 람다식
fun main() {
    myFunc(10) { //전달하는게 하나라면 myFunc(){}에서 ()생략 가능
        println("함수 호출")
    }
}
//함수는 input, output 정의하기

//input, output 아무것도 없다면
fun myFunc(a: Int, callBack : () -> Unit){
    println("함수시작")
    callBack() //함수호출
    println("함수끝")
}