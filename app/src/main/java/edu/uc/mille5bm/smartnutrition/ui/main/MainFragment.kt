package edu.uc.mille5bm.smartnutrition.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import edu.uc.mille5bm.smartnutrition.R
import java.util.zip.Inflater

class MainFragment: Fragment(){

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    /** override fun onActivityCreated(savedInstaceState: Bundle?){
        super.onActivityCreated(savedInstaceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        viewModel.foods.observe(viewLifecycleOwner, Observer{
                foods -> actFood.setAdapter(ArrayAdapter(context!!, R.layout.support_simple_spinner_dropdown_item, foods))
        })
        viewModel.fetchFoods()

    } **/
}