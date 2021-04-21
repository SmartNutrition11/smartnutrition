package edu.uc.mille5bm.smartnutrition.service

import android.util.Log
import androidx.lifecycle.MutableLiveData
import edu.uc.mille5bm.smartnutrition.dao.IFoodDAO
import edu.uc.mille5bm.smartnutrition.dto.Food
import edu.uc.mille5bm.smartnutrition.retrofit.RetrofitClientInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FoodService {
    fun fetchFoods(): MutableLiveData<ArrayList<Food>> {
        var _foods = MutableLiveData<ArrayList<Food>>()
        val service = RetrofitClientInstance.retrofitInstance?.create(IFoodDAO::class.java)
        val call = service?.getAllFoods()
        call?.enqueue(object : Callback<ArrayList<Food>> {
            override fun onFailure(call: Call<ArrayList<Food>>, t: Throwable) {
                Log.w("Failure of Food Call", t);
            }

            override fun onResponse(
                    call: Call<ArrayList<Food>>,
                    response: Response<ArrayList<Food>>
            ) {
                _foods.value = response.body()
            }

        })
        Log.d("Success?",_foods.toString());
        return _foods
    }
}