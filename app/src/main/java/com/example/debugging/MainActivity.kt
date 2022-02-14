package com.example.debugging

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "Main activity"

class MainActivity : AppCompatActivity() {

    fun logging() {
        Log.e(TAG,"ERROR : a serious error like an app crash")
        Log.v(TAG,"WARN : warns an about the potential of serious errors")
        Log.i(TAG,"INFORMATION : reporting technical information, such an operation succeeding")
        Log.d(TAG,"DEBUG : reporting technical information useful for debugging")
        Log.v(TAG, "VERBOSE : more verbose than DEBUG log")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logging()
    }
}