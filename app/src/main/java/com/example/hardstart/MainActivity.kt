package com.example.hardstart


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.hardstart.recycler26.PlantsActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button26 = findViewById<Button>(R.id.btn_recycler_plants_26)!!
        button26.setOnClickListener {
            val intent  = Intent(this,PlantsActivity::class.java)
            startActivity(intent)
        }
    }
}