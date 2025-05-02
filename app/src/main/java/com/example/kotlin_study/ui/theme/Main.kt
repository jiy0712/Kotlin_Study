package com.example.kotlin_study.ui.theme

fun main() {
    print(sum(10, 20))
    print(sum(b = 10, a = 20)) //a,b 순서 안맞춰도 에러 안남
}

//int a, b의 합을 int로 반환하는 함수
fun sum(a: Int, b: Int) : Int{
    return a + b
}

//코틀린 내용이 한줄이라면
//fun sum(a: Int, b: Int) : Int = a + b 로 가능
////fun sum(a: Int, b: Int) = a + b 로 가능 (리턴 타입 생략 가능)

fun sum(a: Int, b: Int, c: Int = 0) = a + b + c
//c에 디폴트값이 있다면 print(sum(10, 20)) 해도 가능