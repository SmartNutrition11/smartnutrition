/** Holds information about Food ..*/
package edu.uc.mille5bm.smartnutrition.dto

import java.util.*

class Food(var id: String, var name: String, var nutritionPer100g: String, var tags: String){
    override fun toString(): String{
        return name
    }
}