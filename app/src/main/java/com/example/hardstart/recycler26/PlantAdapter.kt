package com.example.hardstart.recycler26

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hardstart.R


class PlantAdapter : RecyclerView.Adapter<PlantAdapter.PlantHolder>() {

    private val plantList = ArrayList<Plant>()

    class PlantHolder(item: View) : RecyclerView.ViewHolder(item) {

        fun setData(plant: Plant) {
            itemView.findViewById<ImageView>(R.id.image_View).setImageResource(plant.imageID)
            itemView.findViewById<TextView>(R.id.tv_title).text = plant.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.plant_item, parent, false)
        return PlantHolder(view)
    }

    override fun onBindViewHolder(holder: PlantHolder, position: Int) {
        holder.setData(plantList[position])
    }

    override fun getItemCount(): Int {
        return plantList.size
    }

    fun addPlant(plant: Plant) {
        plantList.add(plant)
        notifyDataSetChanged()

    }

}