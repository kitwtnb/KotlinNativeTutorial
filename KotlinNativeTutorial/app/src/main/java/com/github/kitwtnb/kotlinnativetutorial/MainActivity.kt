package com.github.kitwtnb.kotlinnativetutorial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.github.kitwtnb.kotlinnativetutorial.common.createApplicationScreenMessage

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.main_text).text = createApplicationScreenMessage()
    }
}
