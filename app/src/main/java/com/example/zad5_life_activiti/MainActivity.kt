package com.example.zad5_life_activiti

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.os.PersistableBundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MyLogAct", "onCreate")


    }

    override fun onResume() {
        super.onResume()
        Log.d("MyLogAct", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyLogAct", "onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyLogAct", "onDestroy")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MyLogAct", "onStart")
    }


}