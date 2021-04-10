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
        //val a: Int = 1
        //var b = 2  // int 값을 넣으면 굳이 Int 명시 안해도 됨

        //val 값변경
        //val str =  "코로나 조심하세요"
        //val str2 = str.replace("조심하세요","이겨내요") // str2에 코로나 이겨내요가 들어감
        //val str2 = "${str.replace("조심하세요","이겨내요")}!!" // 코로나 이겨내요!! 로 출력
//        val str2 = str.replace("조심하세요","이겨내요") + "!!" // 코로나 이겨내요!! 가 출력
//        println(str2)
        //2. 코틀린  변수사용 end ------

        //3. 코틀린 함수전달/리턴
//        maxof(3,4)


        //4.1 변환 호출
        /*println(parseInt("100"))
        //2021-04-10 19:27:38.044 17752-17752/com.example.test21 I/System.out: 100
        println(parseInt("무엇"))
        //2021-04-10 19:27:38.044 17752-17752/com.example.test21 I/System.out: null*/

        //4.2 호출
        //println(getStringLength("누구인가? 누가 기침소리를 내었어?"))

        //5 listOf와 반복문
        //val items = listOf("apple", "banana", "kiwifruit") // string 형식으로 넣으면 string 형식 list
        //val items = listOf("3", "2", "1") // int 형식으로 넣으면 int 형식 list
        //즉, 위 items 는
        /*val items : List<String> = listOf("apple", "banana", "kiwifruit")
        val items : List<Int> = listOf("3", "2", "1")*/
        // 이런 형식이 생략된 형태임.

        //for : 크기의 제한이 있는 곳에서 쓸 수있음
        /*for( item in items) { //list 내용 하나하나를 item이라함
            println(item)
        }*/
        /*2021-04-10 19:46:46.328 18127-18127/com.example.test21 I/System.out: apple
        2021-04-10 19:46:46.329 18127-18127/com.example.test21 I/System.out: banana
        2021-04-10 19:46:46.329 18127-18127/com.example.test21 I/System.out: kiwifruit*/

        /*for( index in items.indices) { // item의 index를 참조하고 싶을 때
            println(index)
        }*/
        /*2021-04-10 19:46:46.329 18127-18127/com.example.test21 I/System.out: 0
        2021-04-10 19:46:46.329 18127-18127/com.example.test21 I/System.out: 1
        2021-04-10 19:46:46.329 18127-18127/com.example.test21 I/System.out: 2*/

        /*for( index in items.indices) { // index와 내용 동시 출력
            println("인덱스 : $index, 값 : ${items[index]} ")
        }*/
        /*2021-04-10 19:46:46.329 18127-18127/com.example.test21 I/System.out: 인덱스 : 0, 값 : apple
        2021-04-10 19:46:46.329 18127-18127/com.example.test21 I/System.out: 인덱스 : 1, 값 : banana
        2021-04-10 19:46:46.329 18127-18127/com.example.test21 I/System.out: 인덱스 : 2, 값 : kiwifruit*/

        //while : 크기의 제한이 있는 곳, 제한이 없는 곳 모두 쓸 수 있음
        //          단, 무한루프를 돌기때문에 멈추는 조건을 잘 설정해야함
        /*var index = 0
        while (index < items.size) {
            println("item at $index is ${items[index]}")
            index++
        }*/

        //만약 멈추는 조건을 설정하지 않는다면?
        //while (true) println("뚝배기")
        // 로그챗은 계속올라지만 에뮬레이터는 멈춤.
        // 5 list와 반복문 end ----------------------------------------------------------------------

        //6 when
        /*println(describe(1))
        println(describe("hello"))
        println(describe(5L)) //long
        println(describe(4f)) //float
        println(describe("뚝"))*/
        /*2021-04-10 20:02:05.302 18357-18357/com.example.test21 I/System.out: One
        2021-04-10 20:02:05.302 18357-18357/com.example.test21 I/System.out: Greeting
        2021-04-10 20:02:05.302 18357-18357/com.example.test21 I/System.out: Long
        2021-04-10 20:02:05.302 18357-18357/com.example.test21 I/System.out: Not a String
        2021-04-10 20:02:05.302 18357-18357/com.example.test21 I/System.out: Unknown*/
    }

    //6 when
    /*fun describe(obj: Any) : String =
            when (obj) {  //obj가 들어오면 분기를 시켜서 값을 찾아서 맞는 값을 출력
                1           -> "One"
                "hello"     -> "Greeting"
                is Long     -> "Long"
                !is String  -> "Not a String"
                else        -> "Unknown"
                //위에서 하나 걸러지면 아래쪽은 실행되지 않음
            }*/

    //4.1 변환. sting -> int
    /*fun parseInt(str :  String) : Int? {
        // string을 함수로 받아서 int로 변환. ?는 null값 가능하다는 의미

        var myNum : Int? = null

        //try catch 없으면 문제시 앱이 강제종료됨
        //"1"같이 string 형식으로 된 숫자가 오면 int형식으로 변경
        //"무엇"같이 명백히 숫자가 아닌 string 값이 오면 숫자가 아니라는 exception내보냄
       try { myNum = str.toInt() }
        catch (nfe : NumberFormatException) {return null}
        return myNum
    }*/

    //4.2 obj any -> int
    /*fun getStringLength(obj : Any): Int? {   // obj Any는 String이든 int든 float든 받을 수 있음

        //stirng 받아서 글자수 int로 반환
        if (obj is String) return obj.length
        return null
        //같은의미
        if (obj !is String) return null
        return obj.length
        //조건추가
        if (obj is String && obj.length > 0) {
            return obj.length
        }
        return null

    }*/

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