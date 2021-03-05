/** 
*   Contains the information gathered from the NutritionInfoActivity, CalorieCounterActivity, and HealthTrackerActivity classes 
*
*
*/
package edu.uc.mille5bm.smartnutrition

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.button1).setOnClickListener { startActivity(Intent(applicationContext, NutritionInfoActivity::class.java)) }
        findViewById<View>(R.id.button2).setOnClickListener { startActivity(Intent(applicationContext, CalorieCounterActivity::class.java)) }
        findViewById<View>(R.id.button3).setOnClickListener { startActivity(Intent(applicationContext, HealthTrackerActivity::class.java)) }
    }
}
