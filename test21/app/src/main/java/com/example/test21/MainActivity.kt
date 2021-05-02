package com.example.test21

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //btn.setOnClickListener{ Vibration(1000L)}
    }
    /* 기기 진동
    fun Vibration(len:Long) {
        val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator

        vibrator.vibrate(len)

    }*/

    /*볼륨조절*/
/*
    fun Audio(v: View) {

        var audioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager
        audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC)
        audioManager.getStreamMaxVolume(AudioManager.STREAM_VOICE_CALL)
        audioManager.getStreamMaxVolume(AudioManager.STREAM_RING)
        audioManager.getStreamMaxVolume(AudioManager.STREAM_ALARM)
    }

    */

}