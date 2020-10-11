package com.example.soundpad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity(), CellClickListener {

    private var mRecyclerView: RecyclerView? = null
    private var mAdapter: RecyclerView.Adapter<*>? = null
    var listOfItem: ArrayList<Item> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for(i in 0..100){
            val item = Item()
            item.name = "NAME_$i"
            listOfItem!!.add(item)
        }

        mRecyclerView = findViewById(R.id.mainRecyclerView)
        var mLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        mRecyclerView!!.layoutManager = mLayoutManager
        mAdapter = ItemAdapter(listOfItem,this)
        mRecyclerView!!.adapter = mAdapter
    }

    override fun onCellClickListener() {
//        Toast.makeText(this,"Cell clicked", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, SoundPadActivity::class.java)
        startActivity(intent)
    }
}