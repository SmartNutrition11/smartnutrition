/**This will allow user to enter their activity**/
package edu.uc.mille5bm.smartnutrition

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class CalorieCounterActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tracker)
        var listItems = ArrayList<String>()
        var adapter: ArrayAdapter<String>? = null
        var clickCounter = 0

        adapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                listItems)
    }
    fun addItems(v: View?) {

        findViewById<View>(R.id.llAddActivity).visibility = View.VISIBLE
    }
    fun submit(v: View?) {
        findViewById<View>(R.id.llAddActivity).visibility = View.GONE
        var ed1 = findViewById<EditText>(R.id.etName)
        val ed2 = findViewById<EditText>(R.id.etCal)
        //listItems.add(ed1.text.toString() + ",  Calories Burned: " + ed2.text)
      //  adapter!!.notifyDataSetChanged()
        ed1.setText("")
        ed2.setText("")
    }
}