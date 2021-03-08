package edu.uc.mille5bm.smartnutrition

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.btnNutritionInfo).setOnClickListener { startActivity(Intent(applicationContext, NutritionInfoActivity::class.java)) }
        findViewById<View>(R.id.btnCalorieCounter).setOnClickListener { startActivity(Intent(applicationContext, CalorieCounterActivity::class.java)) }
        findViewById<View>(R.id.btnHealthTracker).setOnClickListener { startActivity(Intent(applicationContext, HealthTrackerActivity::class.java)) }
    }
}