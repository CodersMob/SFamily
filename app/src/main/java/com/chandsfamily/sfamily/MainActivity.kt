package com.chandsfamily.sfamily

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


         var splash = Runnable {
            startActivity(Intent(this,WelcomeToSFamily::class.java))
             finish()
         }

        var mdelayHandler = Handler()

        mdelayHandler.postDelayed(splash,4000)


        }




    }



