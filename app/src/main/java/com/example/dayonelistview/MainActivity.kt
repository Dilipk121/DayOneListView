package com.example.dayonelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val listview = findViewById<ListView>(R.id.listView)

        val taskList = arrayListOf<String>()
        taskList.add("Study Kotlin")
        taskList.add("Study Android Code-1")
        taskList.add("Study Android Code-2")
        taskList.add("Study Android Code-3")
        taskList.add("Study Android Code-4")
        taskList.add("Study Android Code-5")
        taskList.add("Study Android Code-6")
        taskList.add("Improve Internet Presence")

        //ArrayAdapter is inbuilt by android

        val adapterForMyListView = ArrayAdapter(this,android.R.layout.simple_list_item_1, taskList)


        //adapter is like set adapter
        listview.adapter = adapterForMyListView

        listview.setOnItemClickListener { parent, view, position, id ->

            val text = "Clicked on Item : " + (view as TextView).text.toString()

            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()

        }

    }
}