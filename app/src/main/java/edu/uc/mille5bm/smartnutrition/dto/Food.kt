/** Holds information about Food ..*/
package edu.uc.mille5bm.smartnutrition.dto

import com.google.gson.annotations.SerializedName
import java.util.*

data class Food(@SerializedName("id")var id: String, @SerializedName("name") var name: String, @SerializedName("nutrition-per-100ml") var nutritionPer100g: String, @SerializedName("tags") var tags: String){
    override fun toString(): String{
        return name
    }
}