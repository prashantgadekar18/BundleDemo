package com.pg.bundledemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            btn_send.setOnClickListener { view ->

                intent = Intent(this, SecondActivity :: class.java)

//                Here we create bundle, using which we send data using key value paire to next activity
                var bundle = Bundle()
                bundle.putString("FirstName", "Prashant")
                bundle.putString("LastName", "Gadekar")
                intent.putExtras(bundle)   // Add bundle to intent

                startActivity(intent) // start second activity

            }
        } catch (e: Exception) {
        }
    }
}
