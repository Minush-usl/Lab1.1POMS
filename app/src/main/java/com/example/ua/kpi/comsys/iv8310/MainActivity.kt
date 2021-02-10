package com.example.ua.kpi.comsys.iv8310

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val generalFragment = general()
        val item2Fragment = item2()
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.navigationView)

        setActualFragment(generalFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.general -> setActualFragment(generalFragment)
                R.id.item2 -> setActualFragment(item2Fragment)
            }
            true
        }
    }

    private  fun setActualFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment)
            commit()
        }
    }


}