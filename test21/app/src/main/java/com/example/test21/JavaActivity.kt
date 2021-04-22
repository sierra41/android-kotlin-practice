package com.example.test21

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class JavaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java)

        /*비효율적*/
        //TextView tv_result = findViewById(R.id.tv_result)
        //tv_result.setText(getIntent().getExtras().getString("이름") + "님 환영합니다.");

    }
}