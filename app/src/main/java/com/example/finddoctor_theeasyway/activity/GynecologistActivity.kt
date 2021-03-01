package com.example.finddoctor_theeasyway.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.finddoctor_theeasyway.R
import com.example.finddoctor_theeasyway.adaptor.ItemAdaptor
import com.example.finddoctor_theeasyway.model.ItemModel
import kotlinx.android.synthetic.main.activity_gynecologist.*

class GynecologistActivity : AppCompatActivity() {

    private val listItem = arrayOf(
            ItemModel("", "M.B.B.S.(cal), MS(cal) (Obstetries & Gynecology)", "Urmila Farmassist", "Every monday at 3 pm"),
            ItemModel("Dr. G. Vishnu Bandana", "MS, DNV(OBS & GYNAC)\nSenior Consultant Gynocologist", "Urmila Farmassist", "Know the time and date\nplace call-9732451423/8617051281")
    )

    lateinit var adaptor: ItemAdaptor
    private var itemList = ArrayList<ItemModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gynecologist)

        for (item in listItem){
            itemList.add(item)
        }

        adaptor = ItemAdaptor(this, itemList)
        adaptor.setData(itemList)
        doctor_list.layoutManager = LinearLayoutManager(this)
        doctor_list.adapter = adaptor
    }
}