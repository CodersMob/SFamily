package com.chandsfamily.sfamily

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_raja_mantri_chor_sipahi.*

class RajaMantriChorSipahi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_raja_mantri_chor_sipahi)


        imageView2.setOnClickListener {

            Toast.makeText(this,"Tap",Toast.LENGTH_LONG).show()
        }




    }
}
