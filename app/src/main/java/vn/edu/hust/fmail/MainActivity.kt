package vn.edu.hust.fmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myAdapter = MyAdapter(Datasource().loadData())
        val listView = findViewById<ListView>(R.id.listview)
        listView.adapter = myAdapter
    }
}