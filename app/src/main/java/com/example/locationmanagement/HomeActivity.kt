package com.example.locationmanagement

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

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
        var addLocationFragment = AddLocation()
        var listFragment = ListFragment()
        var rantalFragment = RantalFragment()
        var computerFragment = ComputersFragment()

              // change the color of the button clicked and the text.import
        changeFragment(addLocationFragment)

        computerParent.setOnClickListener{           
            handleButtonAnimation(computersView, computersText, R.drawable.computers, homeView, homeText, R.drawable.home_disable, listsView, listText, R.drawable.lists_disable, rantalsview, rantalsText, R.drawable.rentals_disable, enableColor, disableColor)
            changeFragment(computerFragment)
        }
        homeParent.setOnClickListener{
            handleButtonAnimation(homeView, homeText, R.drawable.home, computersView, computersText, R.drawable.computers_disable, listsView, listText, R.drawable.lists_disable, rantalsview, rantalsText, R.drawable.rentals_disable, enableColor, disableColor)
            changeFragment(addLocationFragment)
        }
        rantalParent.setOnClickListener{
            handleButtonAnimation(rantalsview, rantalsText, R.drawable.rentals, homeView, homeText, R.drawable.home_disable, listsView, listText, R.drawable.lists_disable, computersView, computersText, R.drawable.computers_disable, enableColor, disableColor)
            changeFragment(rantalFragment)
        }
        listParent.setOnClickListener{
            handleButtonAnimation(listsView, listText, R.drawable.lists, homeView, homeText, R.drawable.home_disable, computersView, computersText, R.drawable.computers_disable, rantalsview, rantalsText, R.drawable.rentals_disable, enableColor, disableColor)
            changeFragment(listFragment)
        }
        }
    fun handleButtonAnimation(enableView: View, enableText: TextView, enableBackground: Int, disableView1: View, disableText1: TextView, disableBackground1: Int,disableView2: View,disableText2: TextView, disableBackground2: Int,disableView3: View,disableText3: TextView, disableBackground3: Int,enableColor: String, disableColor: String)  {
        enableView.setBackgroundResource(enableBackground)
        enableText.setTextColor(Color.parseColor(enableColor))
        disableView1.setBackgroundResource(disableBackground1)
        disableText1.setTextColor(Color.parseColor(disableColor))
         disableView2.setBackgroundResource(disableBackground2)
        disableText2.setTextColor(Color.parseColor(disableColor))
        disableView3.setBackgroundResource(disableBackground3)
        disableText3.setTextColor(Color.parseColor(disableColor))
    }
    fun changeFragment(fragmentReplacment:Fragment ) {

        var fragment = supportFragmentManager
        var fragmentTransaction = fragment.beginTransaction()
        fragmentTransaction.replace(R.id.frame, fragmentReplacment)
        fragmentTransaction.commit()

    }
}

















