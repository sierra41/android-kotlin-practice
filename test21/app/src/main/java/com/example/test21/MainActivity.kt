package com.example.test21

import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)      //java 에서 find viewid 가져오던 것과 다르게 여기서 알아서 찾아줌

        /*imeOptions : 텍스트 입력 옵션
        * EditorInfo.~ : 키보드 우측 아래 버튼클릭시 액션을 설정가능*/
       //et_email.imeOptions = EditorInfo.IME_ACTION_SEND  => 문자 보내기형태
       // et_age.imeOptions = EditorInfo.IME_ACTION_PREVIOUS  => 이전필드로
        //et_password.imeOptions = EditorInfo.IME_ACTION_NONE  => 특별한 의미없음. 다음칸으로 이동되기는 함
        //   et_name.imeOptions = EditorInfo.IME_ACTION_DONE => 완료버튼



        /*마지막 확인 (edittext 완료 버튼 클릭시) 자동으로 로그인 되도록 하기
        * */
        et_age.setOnEditorActionListener { v, actionId, event ->


            if(actionId == EditorInfo.IME_ACTION_DONE){
                /* 왜 IME_ACTION_DONE 인지?
                =>
                activity_main에서 필드의 순서를 변경해본 결과
                맨 마지막 필드는 특별한 imeOptions 설정을 하지않아도
                자동으로 IME_ACTION_DONE(완료버튼)으로 설정되는 듯*//*
                 */
                Login(v)
                true
            }
            else false

            /*if else 로 완료버튼인지 확인하지 않고 바로 한다면? => 가능*/
            /*Login(v)
            true*/

        }

    }

    fun Login(v : View) {
        println("성공")
    }

}