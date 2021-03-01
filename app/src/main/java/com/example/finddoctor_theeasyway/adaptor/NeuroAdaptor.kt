package com.example.finddoctor_theeasyway.adaptor

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.finddoctor_theeasyway.R
import com.example.finddoctor_theeasyway.model.ItemModel

class NeuroAdaptor(val context: Context, val neuroList: ArrayList<ItemModel>): RecyclerView.Adapter<NeuroAdaptor.NeuroViewHolder>() {

    inner class NeuroViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val nameN: TextView = itemView.findViewById(R.id.neuroName)
        val qualification: TextView = itemView.findViewById(R.id.neuroQualification)
        val please: TextView = itemView.findViewById(R.id.neuroPlease)
        val time: TextView = itemView.findViewById(R.id.neuroTime)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NeuroViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: NeuroViewHolder, position: Int) {
        val neuroItem = neuroList[position]
    }

    override fun getItemCount(): Int {
        return neuroList.size
    }
}