package edu.uc.mille5bm.smartnutrition

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import edu.uc.mille5bm.smartnutrition.dto.Food
import edu.uc.mille5bm.smartnutrition.ui.main.FoodViewModel


class NutritionInfoActivity: AppCompatActivity() {

    lateinit var listView: ListView
    lateinit var stringArrayList: ArrayList<Food>
    lateinit var arrayAdapter: ArrayAdapter<String>
    private lateinit var viewModel: FoodViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrition_info)
        listView = findViewById(R.id.nutritionListView)
    }
}