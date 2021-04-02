
package edu.uc.mille5bm.smartnutrition

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.*
import androidx.cardview.widget.CardView
import edu.uc.mille5bm.smartnutrition.ui.main.BMICalcUtil
import edu.uc.mille5bm.smartnutrition.ui.main.BMICalcUtil.Companion.BMI_CATEGORY_EXTREMELY_OBESE
import edu.uc.mille5bm.smartnutrition.ui.main.BMICalcUtil.Companion.BMI_CATEGORY_HEALTHY
import edu.uc.mille5bm.smartnutrition.ui.main.BMICalcUtil.Companion.BMI_CATEGORY_OBESE
import edu.uc.mille5bm.smartnutrition.ui.main.BMICalcUtil.Companion.BMI_CATEGORY_OVERWEIGHT
import edu.uc.mille5bm.smartnutrition.ui.main.BMICalcUtil.Companion.BMI_CATEGORY_UNDERWEIGHT


class BMIActivity: AppCompatActivity(){
    lateinit var weightKgEditText: EditText
    lateinit var heightCmEditText: EditText
    lateinit var weightLbsEditText: EditText
    lateinit var heightFtEditText: EditText
    lateinit var heightInEditText: EditText
    lateinit var calculateButton: Button
    lateinit var bmiTextView: TextView
    lateinit var categoryTextView: TextView
    lateinit var toggleUnitsButton: ToggleButton
    lateinit var bmiResultCardView: CardView
    var inMetricUnits = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_calculator)
        weightKgEditText = findViewById(R.id.activity_main_weightkgs)
        heightCmEditText = findViewById(R.id.activity_main_heightcm)
        weightLbsEditText = findViewById(R.id.activity_main_weightlbs)
        heightFtEditText = findViewById(R.id.activity_main_heightfeet)
        heightInEditText = findViewById(R.id.activity_main_heightinches)
        calculateButton = findViewById(R.id.activity_main_calculate)
        toggleUnitsButton = findViewById(R.id.activity_main_toggleunits)
        bmiTextView = findViewById(R.id.activity_main_bmi)
        categoryTextView = findViewById(R.id.activity_main_category)
        bmiResultCardView = findViewById(R.id.activity_main_resultcard)
        inMetricUnits = true
        updateInputsVisibility()
        bmiResultCardView.setVisibility(View.GONE)
        calculateButton.setOnClickListener(View.OnClickListener {
            if (inMetricUnits) {
                if (weightKgEditText.length() == 0 || heightCmEditText.length() == 0) {
                    Toast.makeText(this@BMIActivity, "Populate Weight and Height to Calculate BMI", Toast.LENGTH_SHORT).show()
                } else {
                    val heightInCms = heightCmEditText.text.toString().toDouble()
                    val weightInKgs = weightKgEditText.text.toString().toDouble()
                    val bmi = BMICalcUtil().calculateBMIMetric(heightInCms, weightInKgs)
                    displayBMI(bmi)
                }
            } else {
                if (weightLbsEditText.length() == 0 || heightFtEditText.length() == 0 || heightInEditText.length() == 0) {
                    Toast.makeText(this@BMIActivity, "Populate Weight and Height to Calculate BMI", Toast.LENGTH_SHORT).show()
                } else {
                    val heightFeet = heightFtEditText.text.toString().toDouble()
                    val heightInches = heightInEditText.text.toString().toDouble()
                    val weightLbs = weightLbsEditText.getText().toString().toDouble()
                    val bmi = BMICalcUtil().calculateBMIImperial(heightFeet, heightInches, weightLbs)
                    displayBMI(bmi)
                }
            }
        })
        toggleUnitsButton.setOnClickListener(View.OnClickListener {
            inMetricUnits = !inMetricUnits
            updateInputsVisibility()
        })
    }

    private fun updateInputsVisibility() {
        if (inMetricUnits) {
            heightCmEditText.visibility = View.VISIBLE
            weightKgEditText.visibility = View.VISIBLE
            heightFtEditText.visibility = View.GONE
            heightInEditText.visibility = View.GONE
            weightLbsEditText.visibility = View.GONE
        } else {
            heightCmEditText.visibility = View.GONE
            weightKgEditText.visibility = View.GONE
            heightFtEditText.visibility = View.VISIBLE
            heightInEditText.visibility = View.VISIBLE
            weightLbsEditText.visibility = View.VISIBLE
        }
    }

    private fun displayBMI(bmi: Double) {
        bmiResultCardView.visibility = View.VISIBLE
        bmiTextView.text = String.format("%.2f", bmi)
        val bmiCategory =   BMICalcUtil().classifyBMI(bmi)
        categoryTextView.text = bmiCategory
        when (bmiCategory) {
            BMI_CATEGORY_UNDERWEIGHT -> bmiResultCardView.setCardBackgroundColor(Color.BLUE)
            BMI_CATEGORY_HEALTHY -> bmiResultCardView.setCardBackgroundColor(Color.GREEN)
            BMI_CATEGORY_OVERWEIGHT -> bmiResultCardView.setCardBackgroundColor(Color.YELLOW)
            BMI_CATEGORY_OBESE -> bmiResultCardView.setCardBackgroundColor(Color.rgb(255,165,0)) // Orange
            BMI_CATEGORY_EXTREMELY_OBESE -> bmiResultCardView.setCardBackgroundColor(Color.RED)
        }
    }
}