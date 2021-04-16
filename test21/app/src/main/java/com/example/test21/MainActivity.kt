package com.example.test21

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)      //java 에서 find viewid 가져오던 것과 다르게 여기서 알아서 찾아줌

/*       0. kotlin으로 버튼 토스트 btn.setOnClickListener{
            Toast.makeText(this, "toast!", Toast.LENGTH_SHORT).show() //토스트 띄우기
        }*/

        /*20. 버튼 visibility 설정
       btn.visibility = View.INVISIBLE */
        /*21. 버튼 enable
        btn.isEnabled =   false
        btn.isClickable =   false*/


    }

    /*fun DDuck (v : View){  //view 가져오기
       *//* println("뚝!")*//*
        tv.text = "뚝"  // text 변경

    }*/


}