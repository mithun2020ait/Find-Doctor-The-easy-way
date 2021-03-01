package com.example.finddoctor_theeasyway.adaptor

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.finddoctor_theeasyway.R
import com.example.finddoctor_theeasyway.model.ItemModel

class ItemAdaptor(private val context: Context, private var doctorList: ArrayList<ItemModel>):
        RecyclerView.Adapter<ItemAdaptor.ItemViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.doctor_list, parent, false)
        return ItemViewHolder(view)
    }
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val list = doctorList[position]
        holder.doctorName.text = list.Name
        holder.description.text = list.Qualification
        holder.please.text = list.Please
        holder.time.text = list.Time
    }


    override fun getItemCount(): Int {
        return doctorList.size
    }

    fun setData(itemList: java.util.ArrayList<ItemModel>) {
        this.doctorList = itemList
    }

    class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val doctorName: TextView = itemView.findViewById(R.id.doctor_name)
        val description: TextView = itemView.findViewById(R.id.description)
        val please: TextView = itemView.findViewById(R.id.please)
        val time: TextView = itemView.findViewById(R.id.time)
    }


}