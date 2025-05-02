package com.example.kotlin_study.ui.theme

fun main() {
    val jiyoung = Person("jiyoung", 19)
    val jiyoung2 = Person("jiyoung", 19)

    println(jiyoung) // 해시코드 : @6b143ee9
    println(jiyoung2) // 해시코드 : @1936f0f5
    print(jiyoung == jiyoung2) //F로 나옴 (다른사람이니)
}
//data : 재정의 (data class). 이름과 나이가 같으니 같은 사람으로 값이 나온다
data class Person(
    private val name: String,
    var age: Int
){
    var hobby = "축구"
        private set //이렇게 붙이면 외부(fun main)에서 수정 못함
        get() = "취미 : $field" //getter 재정의

    //더 무언가를 하고 싶다면 (실행할때마다 init안의 코드가 실행된다)
    init{
        println("init");
    }

    //생성자안에 별도의 프롬프트가 있다면
    fun some(){
        hobby = "농구"
    }
}