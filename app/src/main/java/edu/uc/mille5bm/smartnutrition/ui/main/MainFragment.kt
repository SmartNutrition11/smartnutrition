package edu.uc.mille5bm.smartnutrition.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import edu.uc.mille5bm.smartnutrition.R
import java.util.zip.Inflater

class MainFragment {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    /***override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstaceState: Bundle?){
        super.onActivityCreated(savedInstaceState)
        viewModel = viewModelProvider.of(this).get(MainViewModel::class)

    }***/
}