package com.example.kotlin_study.ui.theme

open class Person

fun main() {
}

class SuperMan : Person()

abstract class Animal{
    open fun move(){ //open을 해야 상속하고 Dog, Cat에서 오버라이드가 가능
        print("이동")
    }
}
class Dog : Animal(){
    override fun move(){
        print("껑충")
    }
}
class Cat : Animal(){
    override fun move(){
        print("살금")
    }
}