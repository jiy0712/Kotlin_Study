package com.example.kotlin_study.ui.theme

fun main() {
   val jiyoung = Person("jiyoung", 19)
    print(jiyoung.name) //private으로 getter도 불가 (에러)
    print(jiyoung.age)

    jiyoung.age = 23 //var로 수정 가능
    //class의 val와 var를 이용해 getter, setter 기능 가능
}

//코틀린의 기본 생성자를 괄호 안에 작성
//Alt + Enter로 put ~ 를 이용해 깔끔히 정리
class Person(
    private val name: String, //getter, setter 모두 불가 (기본값은 public)
    var age: Int
){

}