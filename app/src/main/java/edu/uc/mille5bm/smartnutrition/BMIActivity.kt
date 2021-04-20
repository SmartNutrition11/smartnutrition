package edu.uc.mille5bm.smartnutrition

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import edu.uc.mille5bm.smartnutrition.databinding.ActivityBmiCalculatorBinding
import edu.uc.mille5bm.smartnutrition.ui.main.BMICalcUtil
import edu.uc.mille5bm.smartnutrition.ui.main.BMICalcUtil.Companion.BMI_CATEGORY_HEALTHY
import edu.uc.mille5bm.smartnutrition.ui.main.BMICalcUtil.Companion.BMI_CATEGORY_OBESE
import edu.uc.mille5bm.smartnutrition.ui.main.BMICalcUtil.Companion.BMI_CATEGORY_OVERWEIGHT
import edu.uc.mille5bm.smartnutrition.ui.main.BMICalcUtil.Companion.BMI_CATEGORY_UNDERWEIGHT


class BMIActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBmiCalculatorBinding
    var inMetricUnits = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBmiCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        inMetricUnits = true
        updateInputsVisibility()
        binding.resultcard.visibility = View.GONE
        binding.btnCalculate.setOnClickListener(View.OnClickListener {
            if (inMetricUnits) {
                if (binding.weightkgs.length() == 0 || binding.heightcm.length() == 0) {
                    showValidationMessage()
                } else {
                    displayBMI(
                        BMICalcUtil().calculateBMIMetric(
                            binding.heightcm.text.toString().toDouble(),
                            binding.weightkgs.text.toString().toDouble()
                        )
                    )
                }
            } else {
                if (binding.weightlbs.length() == 0 || binding.heightfeet.length() == 0 || binding.heightinches.length() == 0) {
                    showValidationMessage()
                } else {
                    displayBMI(
                        BMICalcUtil().calculateBMIImperial(
                            binding.heightfeet.text.toString().toDouble(),
                            binding.heightinches.text.toString().toDouble(),
                            binding.weightlbs.text.toString().toDouble()
                        )
                    )
                }
            }
        })
        binding.toggleunits.setOnClickListener(View.OnClickListener {
            inMetricUnits = !inMetricUnits
            updateInputsVisibility()
        })
    }

    private fun updateInputsVisibility() {
        if (inMetricUnits) {
            binding.heightcm.visibility = View.VISIBLE
            binding.weightkgs.visibility = View.VISIBLE
            binding.heightfeet.visibility = View.GONE
            binding.heightinches.visibility = View.GONE
            binding.weightlbs.visibility = View.GONE
        } else {
            binding.heightcm.visibility = View.GONE
            binding.weightkgs.visibility = View.GONE
            binding.heightfeet.visibility = View.VISIBLE
            binding.heightinches.visibility = View.VISIBLE
            binding.weightlbs.visibility = View.VISIBLE
        }
    }

    private fun showValidationMessage() {
        Toast.makeText(
            this@BMIActivity,
            "Populate Weight and Height to Calculate BMI",
            Toast.LENGTH_SHORT
        ).show()
    }

    private fun displayBMI(bmi: Double) {
        binding.resultcard.visibility = View.VISIBLE
        binding.bmi.text = String.format("%.2f", bmi)
        val bmiCategory = BMICalcUtil().classifyBMI(bmi)
        binding.category.text = bmiCategory
        when (bmiCategory) {
            BMI_CATEGORY_UNDERWEIGHT -> binding.resultcard.setCardBackgroundColor(Color.YELLOW)
            BMI_CATEGORY_HEALTHY -> binding.resultcard.setCardBackgroundColor(Color.BLACK)
            BMI_CATEGORY_OVERWEIGHT -> binding.resultcard.setCardBackgroundColor(Color.YELLOW)
            BMI_CATEGORY_OBESE -> binding.resultcard.setCardBackgroundColor(Color.RED)
        }
    }
}