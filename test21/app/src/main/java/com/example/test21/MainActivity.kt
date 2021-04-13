package com.example.test21

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)      //java 에서 find viewid 가져오던 것과 다르게 여기서 알아서 찾아줌

        btn.setOnClickListener{
            Toast.makeText(this, "toast!", Toast.LENGTH_SHORT).show()
        }                //'.setOnClickListener {


    }

}