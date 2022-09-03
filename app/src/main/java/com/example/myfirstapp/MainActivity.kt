package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import java.io.Serializable

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button2).setOnClickListener {
            val editText = findViewById<EditText>(R.id.editTextTextPersonName)
            val message = editText.text.toString()
            val messageOje= MessageObject(1, message)

            val intent = Intent(this, DisplayMessageActivity::class.java).apply{
                putExtra(EXTRA_MESSAGE, messageOje)
            //     putExtra(EXTRA_MESSAGE2, messageOje)
            }
            startActivity(intent)
        }

    }

}
data class MessageObject(val id: Int, val text: String):Serializable