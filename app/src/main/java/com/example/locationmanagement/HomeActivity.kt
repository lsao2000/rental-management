package com.example.locationmanagement

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.LinearLayout

class HomeActivity : AppCompatActivity() {
    private lateinit var homeView: View
    private lateinit var listsView: View
    private lateinit var rantalsview: View
    private lateinit var computersView: View
    private lateinit var homeText: TextView
    private lateinit var listText: TextView
    private lateinit var rantalsText: TextView
    private lateinit var computersText: TextView
    private lateinit var homeParent: LinearLayout
    private lateinit var listParent: LinearLayout
    private lateinit var rantalParent: LinearLayout
    private lateinit var computerParent: LinearLayout
    private var disableColor = "#696966"
    private var enableColor = "#FFFFFFFF"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        homeParent = findViewById(R.id.home)
        listParent = findViewById(R.id.lists)
        rantalParent = findViewById(R.id.rantals)
        computerParent = findViewById(R.id.computers)
        homeView = findViewById(R.id.homeView)
        listsView = findViewById(R.id.listsView)
        rantalsview = findViewById(R.id.rantalsView)
        computersView = findViewById(R.id.computerView)
        homeText = findViewById(R.id.homeText)
        listText = findViewById(R.id.listsText)
        rantalsText = findViewById(R.id.rantalsText)
        computersText = findViewById(R.id.computersText)
        // change the color of the button clicked and the text. 
        computerParent.setOnClickListener{
            computersText.setTextColor(Color.parseColor(enableColor)
            computersView.setBackgroundResource(R.drawable.computers)
            listsView.setBackgroundResource(R.drawable.lists_disable)
            listText.setTextColor(Color.parseColor(R.color.disable))
            homeView.setBackgroundResource(R.drawable.home_disable)
            homeText.setTextColor(Color.parseColor(R.color.disable))
            rantalsview.setBackgroundResource(R.drawable.rantals_disable)
            rantalsText.setTextColor(Color.parseColor(R.color.disable))

        }
        homeParent.setOnClickListener{
            computersText.setTextColor(Color.parseColor(disableColor))
            computersView.setBackgroundResource(R.drawable.computers_disable)
            listsView.setBackgroundResource(R.drawable.lists_disable)
            listText.setTextColor(Color.parseColor(disableColor)
            homeView.setBackgroundResource(R.drawable.home)
            homeText.setTextColor(Color.parseColor(enableColor))
            rantalsview.setBackgroundResource(R.drawable.rantals_disable)
            rantalsText.setTextColor(Color.parseColor(disableColor))

        }
        rantalParent.setOnClickListener{
            computersText.setTextColor(Color.parseColor(R.color.disable))
            computersView.setBackgroundResource(R.drawable.computers_disable)
            listsView.setBackgroundResource(R.drawable.lists_disable)
            listText.setTextColor(Color.parseColor(R.color.disable))
            homeView.setBackgroundResource(R.drawable.home_disable)
            homeText.setTextColor(Color.parseColor(R.color.disable))
            rantalsview.setBackgroundResource(R.drawable.rantals)
            rantalsText.setTextColor(Color.parseColor(R.color.enable))

        }
        listParent.setOnClickListener{
            computersText.setTextColor(Color.parseColor(R.color.disable))
            computersView.setBackgroundResource(R.drawable.computers_disable)
            listsView.setBackgroundResource(R.drawable.lists)
            listText.setTextColor(Color.parseColor(R.color.enable))
            homeView.setBackgroundResource(R.drawable.home_disable)
            homeText.setTextColor(Color.parseColor(R.color.disable))
            rantalsview.setBackgroundResource(R.drawable.rantals_disable)
            rantalsText.setTextColor(Color.parseColor(R.color.disable))

        }
            }
}

















