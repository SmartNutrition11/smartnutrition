/**Calculates BMI and identifies categories**/
package edu.uc.mille5bm.smartnutrition.ui.main

class BMICalcUtil {
    fun calculateBMIMetric(heightCm: Double, weightKg: Double): Double {
        return weightKg / (heightCm / CENTIMETERS_IN_METER * (heightCm / CENTIMETERS_IN_METER))
    }
    fun calculateBMIImperial(heightFeet: Double, heightInches: Double, weightLbs: Double): Double {
        val totalHeightInInches = heightFeet * INCHES_IN_FOOT + heightInches
        return BMI_IMPERIAL_WEIGHT_SCALAR * weightLbs / (totalHeightInInches * totalHeightInInches)
    }

    fun classifyBMI(bmi: Double): String {
        return if (bmi < 18.5) {
            BMI_CATEGORY_UNDERWEIGHT
        } else if (bmi >= 18.5 && bmi < 25) {
            BMI_CATEGORY_HEALTHY
        } else if (bmi >= 25 && bmi < 30) {
            BMI_CATEGORY_OVERWEIGHT
        } else {
            BMI_CATEGORY_OBESE
        }
    }

    companion object {
        val instance = BMICalcUtil()
        private const val CENTIMETERS_IN_METER = 100
        private const val INCHES_IN_FOOT = 12
        private const val BMI_IMPERIAL_WEIGHT_SCALAR = 703
        const val BMI_CATEGORY_UNDERWEIGHT = "Underweight"
        const val BMI_CATEGORY_HEALTHY = "Healthy Weight Range"
        const val BMI_CATEGORY_OVERWEIGHT = "Overweight"
        const val BMI_CATEGORY_OBESE = "Obese"
    }
}