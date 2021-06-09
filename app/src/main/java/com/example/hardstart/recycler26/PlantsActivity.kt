package com.example.hardstart.recycler26

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hardstart.R


class PlantsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plants)


         val adapter = PlantAdapter()

         val imageIdList = listOf(
            R.drawable.cultivated_flowers,
            R.drawable.red_roses_flowers,
            R.drawable.some_flowers,
            R.drawable.some_flowers_two
        )

        var index = 0

         val buttonAdd = findViewById<Button>(R.id.btn_add)!!


         val rcView = findViewById<RecyclerView>(R.id.rc_view)!!


        fun init() {
            rcView.layoutManager = GridLayoutManager(this@PlantsActivity, 3)
            rcView.adapter = adapter
            buttonAdd.setOnClickListener {
                if (index > 3) index = 0
                val plant = Plant(imageIdList[0], "Plant $index")
                adapter.addPlant(plant)
                index++
            }
        }



    }
}