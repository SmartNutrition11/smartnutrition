package edu.uc.mille5bm.smartnutrition.ui.main

import androidx.lifecycle.MutableLiveData
import edu.uc.mille5bm.smartnutrition.dto.Food
import edu.uc.mille5bm.smartnutrition.service.FoodService


class MainViewModel {
    var _foods: MutableLiveData<ArrayList<Food>> = MutableLiveData<ArrayList<Food>>()
    var foodService: FoodService = FoodService()

    init{
        fetchFoods("b")
    }

    fun fetchFoods(foodName: String){
        _foods = foodService.fetchFoods(foodName)
    }

    internal var foods:MutableLiveData<ArrayList<Food>>
        get() {return _foods}
        set(value) {_foods = value}
}