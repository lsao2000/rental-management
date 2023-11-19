package com.example.locationmanagement

import android.app.ActionBar.LayoutParams
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.os.Handler
import android.os.Looper
import android.content.Intent
class MainActivity : AppCompatActivity() {
    private lateinit var firstChar : TextView
    private lateinit var secondChar: TextView
    private lateinit var animIntro : Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
        setContentView(R.layout.activity_main)
        firstChar = findViewById(R.id.firstWord)
        secondChar = findViewById(R.id.secondWord)
        animIntro = AnimationUtils.loadAnimation(this, R.anim.into_animation)
        firstChar.animation = animIntro
        secondChar.animation = animIntro
        Handler(Looper.getMainLooper()).postDelayed(Runnable(){
            var inte = Intent(this, HomeActivity::class.java)
            startActivity(inte)
        }, 4000)
    }
}