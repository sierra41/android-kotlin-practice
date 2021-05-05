package com.example.test21

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.net.ConnectivityManager
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class test7MainActivity : AppCompatActivity(), SensorEventListener {

    //와이파이데이터체크
   /* override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener{ NetworkCheck(btn)}
    }

    fun NetworkCheck(v: View){

        val connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        println(connectivityManager.activeNetworkInfo?.isConnected)
    }*/


    //센서 설정
    /*lateinit var sensorManager: SensorManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    override fun onResume() {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE), SensorManager.SENSOR_DELAY_NORMAL)

        super.onResume()
    }

    override fun onPause() {
        super.onPause()

        sensorManager.unregisterListener(this)
    }
    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
        TODO("Not yet implemented")
    }

    override fun onSensorChanged(p0: SensorEvent?) {
        val x = event?.value?.get(0) as Float
        val z = event?.value?.get(1) as Float
        val y = event?.value?.get(2) as Float

        println(x.toString() + ", " + y.toString() + ", " + z.toString())
    }*/


}