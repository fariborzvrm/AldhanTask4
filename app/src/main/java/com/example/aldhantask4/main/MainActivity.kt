package com.example.aldhantask4.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aldhantask4.R
import com.example.aldhantask4.aladhan.AladhanActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtOghat.setOnClickListener {
            val intent = Intent(this,AladhanActivity::class.java)
            startActivity(intent)
        }
    }
}
