package com.example.finddoctor_theeasyway.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.finddoctor_theeasyway.R
import com.example.finddoctor_theeasyway.adaptor.DoctorAdaptor
import com.example.finddoctor_theeasyway.model.DoctorModel
import kotlinx.android.synthetic.main.activity_orthopedic_surgeon.*

class OrthopedicSurgeonActivity : AppCompatActivity() {
    private val list = arrayOf(
            DoctorModel("", "", "", "")
    )
    private lateinit var adaptor: DoctorAdaptor
    private val listItem = ArrayList<DoctorModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orthopedic_surgeon)

        for (item in list){
            listItem.add(item)
        }
        adaptor = DoctorAdaptor(this, listItem)
        adaptor.setData(listItem)
        item_list.layoutManager = LinearLayoutManager(this)
        item_list.adapter = adaptor
    }
}