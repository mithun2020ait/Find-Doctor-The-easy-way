package com.example.finddoctor_theeasyway.adaptor

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.finddoctor_theeasyway.R
import com.example.finddoctor_theeasyway.model.DoctorModel

class DoctorAdaptor(val context: Context, private var doctorList: ArrayList<DoctorModel>): RecyclerView.Adapter<DoctorAdaptor.DoctorViewHolder>() {

    inner class DoctorViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val textView1: TextView = itemView.findViewById(R.id.doctorName)
        val textView2: TextView = itemView.findViewById(R.id.qualification)
        val textView3: TextView = itemView.findViewById(R.id.pleaseSet)
        val textView4: TextView = itemView.findViewById(R.id.time1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoctorViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.list_doctor, parent, false)
        return DoctorViewHolder(view)
    }

    override fun onBindViewHolder(holder: DoctorViewHolder, position: Int) {
      val list = doctorList[position]
        holder.textView1.text = list.name
        holder.textView2.text = list.qualification
        holder.textView3.text= list.please
        holder.textView4.text = list.time
    }

    override fun getItemCount(): Int {
        return doctorList.size
    }

    fun setData(doctorList: ArrayList<DoctorModel>) {
        this.doctorList  = doctorList

    }
}