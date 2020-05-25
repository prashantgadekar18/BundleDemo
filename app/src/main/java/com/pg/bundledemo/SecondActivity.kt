package com.pg.bundledemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

/**
 * Created by Prashant Gadekar on 25-05-2020.
 */

class SecondActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        setBundleDataToTextView()

    }

    private fun setBundleDataToTextView() {

//        Declare bundle variable to read data send from MainActivity intent
//        Note: While reading value key name must be same
        val bundle: Bundle? = intent.extras
        val strFirstName = bundle?.getString("FirstName"); // Read values using KeyName
        val strLastName = bundle?.getString("LastName");

        val strData: String ?= "First Name :" + strFirstName +"\n Last Name :" + strLastName

        tv_bundle_data.setText(strData);

    }

}