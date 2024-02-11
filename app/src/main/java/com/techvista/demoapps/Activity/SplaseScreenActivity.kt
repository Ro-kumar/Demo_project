package com.techvista.demoapps.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.techvista.demoapps.R
import com.techvista.demoapps.databinding.ActivitySplaseScreenBinding

class SplaseScreenActivity : AppCompatActivity() {

    lateinit var binding:ActivitySplaseScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySplaseScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)


        Handler().postDelayed(Runnable {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        }, 3000)


    }
}