package edu.uc.mille5bm.smartnutrition.ui.main

import androidx.lifecycle.MutableLiveData
import edu.uc.mille5bm.smartnutrition.dto.Food
import edu.uc.mille5bm.smartnutrition.service.FoodService


class MainViewModel {
    var foods: MutableLiveData<ArrayList<Food>> = MutableLiveData<ArrayList<Food>>()
    var foodService: foodService = foodService()

    fun fetchFoods(foodName: String){
        foods = foodService.fetchFoods(foodName)
    }
}