/**This will allow user to enter their activity**/
package edu.uc.mille5bm.smartnutrition

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_tracker.*

class CalorieCounterActivity: AppCompatActivity() {
    var listItems = ArrayList<String>()
    var adapter: ArrayAdapter<String>? = null
    var clickCounter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tracker)
        adapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                listItems)
        val activityListView: ListView = findViewById<ListView>(R.id.actListView)
        activityListView.setAdapter(adapter)
    }
    fun addItems(v: View?) {
        var ed1 = findViewById<EditText>(R.id.etName)
        var ed2 = findViewById<EditText>(R.id.etCal)
        adapter?.add(ed1.text.toString() + ",  Calories Burned: " + ed2.text)
        ed1.setText("")
        ed2.setText("")
    }
}