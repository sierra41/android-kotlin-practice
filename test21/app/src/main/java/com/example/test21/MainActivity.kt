package com.example.test21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    //초기화 : 전역변수에서 쓰려며 반드시 초기화 필요
    //val a: Int = 1
    //var b = 2
    //var b : Int => 에러

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //println("안녕하세요")


        //1. 코틀린 함수사용 start --------------------------------------------
        //a, b는 입력x 값만 입력
        //int 출력
        //println(sum(1, 2 ))
        //매개변수에서 ctrl +space : 받는 변수 형식, 출력 형식 정보 확인 가능
        //방법2 :2021-04-07 19:05:02.328 14953-14953/com.example.test21 I/System.out: 3
        //방법1 :2021-04-07 19:07:10.700 15070-15070/com.example.test21 I/System.out: 3

        //float출력
        //float는 강제형변환 안됨. 출력전에 직접 형변환해줘야함
        // println(sum(1, 2.0f ))
        // int+float 반환값 : float (ctrl +space 로 출력형식 확인가능)
        //2021-04-07 19:12:07.570 15261-15261/com.example.test21 I/System.out: 3.0

         //반환값 없는 경우 출력
        //sum(3,4)
        //1. 코틀린 함수사용 end --------------------------------------------

        //2. 코틀린  변수사용 start ------
        //val a: Int  => 한번 대입하면 재입력 불가
        //var b: Int  => 다시 재입력 가능
        //a = 1
        //a = 2 => 에러
        //b = 1
        //b = 2

        //초기화
        val a: Int = 1
        var b = 2  // int 값을 넣으면 굳이 Int 명시 안해도 됨

        //val 값변경
        val str =  "코로나 조심하세요"
        //val str2 = str.replace("조심하세요","이겨내요") // str2에 코로나 이겨내요가 들어감
        //val str2 = "${str.replace("조심하세요","이겨내요")}!!" // 코로나 이겨내요!! 로 출력
//        val str2 = str.replace("조심하세요","이겨내요") + "!!" // 코로나 이겨내요!! 가 출력
//        println(str2)
        //2. 코틀린  변수사용 end ------

        //3. 코틀린 함수전달/리턴
//        maxof(3,4)


    }

    //3. 코틀린 함수전달/리턴
    //3.1) full
    /*fun maxof(a: Int, b: Int) : Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }*/
    //3.2 short
    /*fun maxof(a: Int, b: Int) : Int {
        if (a > b)  return a
        else return b
    }*/
    //3.3 superShort
    /*fun maxof(a: Int, b: Int) = if(a > b) a else b
    }*/

    fun parseInt(str :  String) : Int {
        isnull // 
    }

    //1. 코틀린 함수사용 start --------------------------------------------
    //fun : 함수라는 의미, 변수의 자료형은 첫글자 대문자로
    // int
    // 풀어쓰는 방법
    //fun sum( a  :Int, b :Int) : Int {
    //    return a+b
    //}
    // 줄여쓰는 방법
    // fun sum( a  :Int, b :Int) = a + b

    //float 사용
    //fun sum( a  :Int, b :Float) = a + b

    //반환값 없는 경우
    //반환값 자리에 비워도 되고
    //  fun sum( a  :Int, b :Int){
    //반환값 자리에 Unit 이라고 적어도 된다
    //  fun sum( a  :Int, b :Int) : Unit {
    // $는 변수의 값을 가져온다는 의미
    //fun sum( a  :Int, b :Int){
    //    println("$a 와 $b 의 합은 ${a+b}")
    //}
    //2021-04-07 19:19:20.372 15439-15439/com.example.test21 I/System.out: 3 와 4 의 합은 7
    // 1. 코틀린 함수사용 end ---------------------------------------------------------------------



}