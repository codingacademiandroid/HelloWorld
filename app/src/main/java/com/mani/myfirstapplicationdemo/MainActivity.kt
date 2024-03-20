package com.mani.myfirstapplicationdemo

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity(), View.OnClickListener {

    // Declaration of View Components

     lateinit var tvContent : TextView
     lateinit var btnSubmit : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialization of View Components

        tvContent = findViewById(R.id.tvContent);
        btnSubmit = findViewById(R.id.btnSubmit);

        // Implement onClick Listeners for Button

        btnSubmit.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {

        val contentText = tvContent.text.toString()

        Toast.makeText(this,contentText,Toast.LENGTH_SHORT).show()
    }
}