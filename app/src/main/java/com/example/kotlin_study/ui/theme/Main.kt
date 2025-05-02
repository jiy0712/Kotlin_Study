package com.example.kotlin_study.ui.theme

open class Person

fun main() {
}

interface Drawable{
    fun draw()
}

class SuperMan : Person()

abstract class Animal{
    open fun move(){ //open을 해야 상속하고 Dog, Cat에서 오버라이드가 가능
        print("이동")
    }
}
class Dog : Animal(), Drawable{ //인터페이스 적용 방법 (, Drawable)
    override fun move(){
        print("껑충")
    }

    override fun draw() {
        TODO("Not yet implemented")
    }

}
class Cat : Animal(), Drawable{
    override fun move(){
        print("살금")
    }

    override fun draw() {
        TODO("Not yet implemented")
    }
}