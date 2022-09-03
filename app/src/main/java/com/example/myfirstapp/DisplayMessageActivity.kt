package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
        val messageObject = intent.getSerializableExtra(EXTRA_MESSAGE) as MessageObject
        findViewById<TextView>(R.id.textView).apply{
            text = messageObject.text
        }

    }
}