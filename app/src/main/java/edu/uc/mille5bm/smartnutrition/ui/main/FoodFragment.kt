package edu.uc.mille5bm.smartnutrition.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import edu.uc.mille5bm.smartnutrition.R
import edu.uc.mille5bm.smartnutrition.dto.Food
import edu.uc.mille5bm.smartnutrition.service.FoodService
import kotlinx.android.synthetic.main.activity_nutrition_info.*

class FoodFragment : Fragment() {

    companion object {
        fun newInstance() = FoodFragment()
    }

    private lateinit var viewModel: FoodViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.activity_nutrition_info,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FoodViewModel::class.java)
        viewModel.foods.observe(this, Observer{
            foods -> nutritionListView.setAdapter(ArrayAdapter(context!!,R.layout.support_simple_spinner_dropdown_item, foods))
        })
        viewModel.fetchFoods()
    }
}