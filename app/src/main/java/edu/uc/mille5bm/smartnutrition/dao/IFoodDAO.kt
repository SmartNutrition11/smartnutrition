package edu.uc.mille5bm.smartnutrition.dao

import  edu.uc.mille5bm.smartnutrition.dto.Food
import  retrofit2.Call
import retrofit2.http.GET

interface IFoodDAO {

    @GET("https://github.com/terrenjpeterson/caloriecounter/blob/master/src/data/foods.json")
    fun getAllFoods(): Call<ArrayList<Food>>
}