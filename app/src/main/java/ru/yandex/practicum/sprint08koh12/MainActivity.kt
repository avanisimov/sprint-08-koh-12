package ru.yandex.practicum.sprint08koh12

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val TAG = "SPRINT_8"

    var lastOnStop: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "$this onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "$this onStart ${System.currentTimeMillis()}")
        val now = System.currentTimeMillis()
        if ((now - lastOnStop) > 5000) {
            Log.d(TAG, "PIN_CODE")
        } else {
            Log.d(TAG, "OKAY")
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "$this onResume")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.d(TAG, "$this onConfigurationChanged")
    }

    override fun onBackPressed() {
        super.onBackPressed()

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "$this onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "$this onStop ${System.currentTimeMillis()}")
        lastOnStop = System.currentTimeMillis()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "$this onDestroy")
    }

}