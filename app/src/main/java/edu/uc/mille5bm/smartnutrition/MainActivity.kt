package edu.uc.mille5bm.smartnutrition

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.uc.mille5bm.smartnutrition.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.btn_nutrition).setOnClickListener { startActivity(Intent(applicationContext, NutritionInfoActivity::class.java)) }
        findViewById<View>(R.id.btn_caloriepage).setOnClickListener { startActivity(Intent(applicationContext, CalorieCounterActivity::class.java)) }
        findViewById<View>(R.id.btn_health).setOnClickListener { startActivity(Intent(applicationContext, BMIActivity::class.java)) }
    }
}