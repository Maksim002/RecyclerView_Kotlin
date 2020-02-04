package com.example.recyclerview_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview_kotlin.adapter.AdapterRecyclerView
import com.example.recyclerview_kotlin.adapter.DataSource
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var bAdapter: AdapterRecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     val bottom: TextView = findViewById(R.id.bottoms)

        initRecyclerView()
        addDataSet()

        bottom.setOnClickListener {
            val intent = Intent(this, MainActivityS::class.java)
            startActivity(intent)
        }
    }

    private fun  addDataSet(){
        val data = DataSource.crateDtaSet()
        bAdapter.submitList(data)
    }

    private fun initRecyclerView(){
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            bAdapter = AdapterRecyclerView()
            adapter = bAdapter
        }
    }
}
