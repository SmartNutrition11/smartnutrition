package edu.uc.mille5bm.smartnutrition.dao

import  edu.uc.mille5bm.smartnutrition.dto.Food
import  retrofit2.Call
import retrofit2.http.GET

interface IFoodDAO {

    @GET("https://github.com/noizwaves/nutrition/blob/master/data/food.json")
    fun getAllFoods(): Call<ArrayList<Food>>
}