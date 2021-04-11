package edu.uc.mille5bm.smartnutrition.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import edu.uc.mille5bm.smartnutrition.dto.Exercise
import edu.uc.mille5bm.smartnutrition.dto.Food
import edu.uc.mille5bm.smartnutrition.service.ExerciseService
import edu.uc.mille5bm.smartnutrition.service.FoodService


class MainViewModel: ViewModel() {
    var foods: MutableLiveData<ArrayList<Food>> = MutableLiveData<ArrayList<Food>>()
    var foodService: FoodService = FoodService()

    fun fetchFoods(){
        foods = foodService.fetchFoods()
    }
    var exercises: MutableLiveData<ArrayList<Exercise>> = MutableLiveData<ArrayList<Exercise>>()
    var exerciseService: ExerciseService = ExerciseService()

    fun fetchExercise(){
        exercises = exerciseService.fetchExercises()
    }
}