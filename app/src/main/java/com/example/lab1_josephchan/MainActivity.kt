package com.example.lab1_josephchan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTextView = findViewById<TextView>(R.id.textView_main)
    }

    fun doSomething(view: View){
        val myTextView = findViewById<TextView>(R.id.textView_main)
        val myEditText = findViewById<EditText>(R.id.editText_main)
        val str = myEditText.text
        myTextView.text = str
    }
}