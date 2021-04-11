package edu.uc.mille5bm.smartnutrition

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.uc.mille5bm.smartnutrition.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnNutrition.setOnClickListener { startActivity(Intent(applicationContext, NutritionInfoActivity::class.java)) }
        binding.btnCalorie.setOnClickListener { startActivity(Intent(applicationContext, CalorieCounterActivity::class.java)) }
        binding.btnHealth.setOnClickListener { startActivity(Intent(applicationContext, BMIActivity::class.java)) }
    }
}