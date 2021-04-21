package edu.uc.mille5bm.smartnutrition.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import edu.uc.mille5bm.smartnutrition.dto.Food
import edu.uc.mille5bm.smartnutrition.service.FoodService

class FoodViewModel : ViewModel(){
    var foods: MutableLiveData<ArrayList<Food>> = MutableLiveData<ArrayList<Food>>()
    var foodService: FoodService = FoodService()

    init {
        fetchFoods()
    }

    fun fetchFoods(){
        foods = foodService.fetchFoods()
    }
}