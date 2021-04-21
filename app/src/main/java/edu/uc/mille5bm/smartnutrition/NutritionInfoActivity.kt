package edu.uc.mille5bm.smartnutrition

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import edu.uc.mille5bm.smartnutrition.dto.Food
import edu.uc.mille5bm.smartnutrition.ui.main.FoodViewModel
import kotlinx.android.synthetic.main.activity_nutrition_info.*


class NutritionInfoActivity: AppCompatActivity() {

    lateinit var listView: ListView
    lateinit var foodArrayList: ArrayList<Food>
    lateinit var arrayAdapter: ArrayAdapter<String>
    private lateinit var viewModel: FoodViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrition_info)
        viewModel = ViewModelProviders.of(this).get(FoodViewModel::class.java)
        listView = findViewById(R.id.nutritionListView)
        viewModel.foods.observe(this, Observer {
            foods -> listView.setAdapter(ArrayAdapter(baseContext!!,R.layout.support_simple_spinner_dropdown_item,foods))
        })
    }
}