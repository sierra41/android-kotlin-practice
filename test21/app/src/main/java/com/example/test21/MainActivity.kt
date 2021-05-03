package com.example.test21

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //푸시
        //btn.setOnClickListener{ ShowNotification("제목", "내용")}

        val pref = getSharedPreferences("pref", Context.MODE_PRIVATE)
        pref.edit().putString("키", "값").apply()
        val value = pref.getString("키", "저장안됨")
        pref.edit().remove("키").apply()
        pref.edit().clear().apply()


        //타임피커
        //btn.setOnClickListener{ Vibration(1000L)}
        //timePicker.hour
        //timePicker.minute
        /*timePicker.setOnTimeChangedListener{timePicker, i , i2 ->

            println(i.toString() + ": " + i2.toString())
        }*/
    }

    private fun ShowNotification(Title: String, Body: String) {
        val pending = PendingIntent.getActivity(this, 0, Intent(this, MainActivityL::class.java), PendingIntent.FLAG_CANCEL_CURRENT)
        val builder = NotificationCompat.Builder(this, "id")
        builder.setSmallIcon(R.drawable.ic_launcher_background)
                .setContentText(Body)
                .setContentTitle(Title)
                .setContentIntent(pending)
                .setAutoCancel(true)
                .setDefaults(Notification.DEFAULT_SOUND or Notification.DEFAULT_VIBRATE)


        val NManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.0) {
            NManager.createNotificationChannel(NotificationChannel("id", "name"), NotificationManager.IMPORTANCE_HIGH))

        }
        NManager.notify(0, builder.build())

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