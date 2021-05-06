package com.example.test21

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    btn.setOnClickListener {
     val ad = AlertDialog.Builder(this)
        ad.setTitle("제목")
        ad.setMessage("내용")
        ad.setIcon(R.mipmap.ic_launcher)
        ad.setView(EditText(this))
        ad.setPositiveButton("네", object:DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {
                println("네 클릭")
                p0?.dismiss()
            }
        })
        ad.setNegativeButton("아니요", object:DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {
                println("아니오오 클릭"
                p0?.dismiss()
            }
        })
    }


    btn.setOnClickListener
    {
        var intent = Intent()
        intent.setAction(Intent.ACTION_SEND)
        intent.setType("text/plain")
        intent.putExtra(Intent.EXTRA_SUBJECT, title)
        intent.putExtra(Intent.EXTRA_TEXT, "내용")
        startActivity(Intent.createChooser(intent, "공유"))
    }
}