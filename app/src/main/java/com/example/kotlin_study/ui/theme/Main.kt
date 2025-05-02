package com.example.kotlin_study.ui.theme

fun main() {
    val box = Box(10)
    val box2 = Box("dfdfd")

    print(box.value)
}
//제네릭(프로그래밍에서 타입 파라미터를 사용하여 코드를 일반화하고 재사용성을 높이는 방법)
class Box<T>(var value: T){

}