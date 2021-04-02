package edu.uc.mille5bm.smartnutrition.service

import androidx.lifecycle.MutableLiveData
import edu.uc.mille5bm.smartnutrition.dao.IExerciseDAO
import edu.uc.mille5bm.smartnutrition.dao.IFoodDAO
import edu.uc.mille5bm.smartnutrition.dto.Exercise
import edu.uc.mille5bm.smartnutrition.dto.Food
import edu.uc.mille5bm.smartnutrition.retrofit.RetrofitClientInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ExerciseService {
    fun fetchExercises() : MutableLiveData<ArrayList<Exercise>> {
        var _exercises = MutableLiveData<ArrayList<Exercise>>()
        val service = RetrofitClientInstance.retrofitInstance?.create(IExerciseDAO::class.java)
        val call = service?.getAllExercises()
        call?.enqueue(object : Callback<ArrayList<Exercise>> {
            override fun onFailure(call: Call<ArrayList<Exercise>>, t: Throwable) {
                val j = 1 + 1
                val i = 1 + 1
            }

            override fun onResponse(
                call: Call<ArrayList<Exercise>>,
                response: Response<ArrayList<Exercise>>
            ) {
                _exercises.value = response.body()
            }

        })
        return _exercises
    }
}