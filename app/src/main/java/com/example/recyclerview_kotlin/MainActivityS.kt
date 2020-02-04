package com.example.recyclerview_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerview_kotlin.adapter.AdapterRecyclerViewS
import com.example.recyclerview_kotlin.adapter.DataSource
import kotlinx.android.synthetic.main.activity_main_s.*

class MainActivityS : AppCompatActivity(){

    private lateinit var sAdapter: AdapterRecyclerViewS

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_s)
        gitRecyclerView()
        getDataSource()

    }
    private fun getDataSource(){
        val data = DataSource.crateDtaSet()
        sAdapter.submitList(data)
    }

    private fun gitRecyclerView(){
        recyclerViewS.apply {
            sAdapter = AdapterRecyclerViewS();
            adapter = sAdapter
        }

    }
}