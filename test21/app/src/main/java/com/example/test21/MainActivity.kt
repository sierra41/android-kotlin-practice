package com.example.test21

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.media.MediaParser
import android.net.ConnectivityManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity(), SensorEventListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //btn.setOnClickListener{ Click(btn)}
    }

   /* fun Click(v:View){
        val mediaPlayer = MediaParser.create(this, R.raw.coin_sound)
        mediaPlayer.start()
        mediaPlayer.setOnCompletionListener { mediaPlayer.release()}
    }*/

}

/*클래스로 flag*/
class OneFragment:Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?)
        //eturn super.onCreateView(inflater, container, savedInstanceState)
        = inflater.inflate(R.layout.frag1, container, false)


}