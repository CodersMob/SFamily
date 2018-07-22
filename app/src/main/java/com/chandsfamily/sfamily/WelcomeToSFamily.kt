package com.chandsfamily.sfamily

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class WelcomeToSFamily : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_to_sfamily)
    }

    open fun clicks(view: View):Unit{

        when(view.id)
        {
            R.id.rjmt -> startActivity(Intent(this,RajaMantriChorSipahi::class.java))


        }

    }

}
