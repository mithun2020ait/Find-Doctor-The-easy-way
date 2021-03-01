package com.example.finddoctor_theeasyway.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.finddoctor_theeasyway.R
import com.example.finddoctor_theeasyway.adaptor.RecyclerAdaptor
import com.example.finddoctor_theeasyway.model.SpecialModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), RecyclerAdaptor.ClickedListener {


    private val itemList = arrayOf(
            SpecialModel("Gynecologist", R.drawable.medical_services),
            SpecialModel("Neurologist",R.drawable.medical_services),
            SpecialModel("Orthopedic Surgeon", R.drawable.medical_services),
            SpecialModel("ENT Specialist", R.drawable.medical_services),
            SpecialModel("Urologist", R.drawable.medical_services),
            SpecialModel("Dentist", R.drawable.medical_services),
            SpecialModel("Gastroenterologist", R.drawable.medical_services),
            SpecialModel("Dermatologist", R.drawable.medical_services),
            SpecialModel("Pediatrician", R.drawable.medical_services),
            SpecialModel("Neonatologist", R.drawable.medical_services),
            SpecialModel("Psychiatrist", R.drawable.medical_services),
            SpecialModel("Nephrologist", R.drawable.medical_services),
            SpecialModel("Ophthalmologists", R.drawable.medical_services),
            SpecialModel("Endocrinologist", R.drawable.medical_services),
            SpecialModel("Sexologist", R.drawable.medical_services),
            SpecialModel("General Medicine", R.drawable.medical_services),
            SpecialModel("Physiotherapist", R.drawable.medical_services)
    )

    private lateinit var adaptor: RecyclerAdaptor
    private var specialList = ArrayList<SpecialModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (item in itemList){
            specialList.add(item)
        }

        

        adaptor = RecyclerAdaptor(this, specialList, this)
        adaptor.setData(specialList)
        specialization_item.layoutManager = LinearLayoutManager(this)
        specialization_item.adapter = adaptor
    }

    override fun onItemClicked(specialModel: SpecialModel) {

        when(specialModel.Specialization){
            "Gynecologist" ->
                startActivity(Intent(this@MainActivity, GynecologistActivity::class.java))
            "Neurologist" ->
                startActivity(Intent(this@MainActivity, NeurologistActivity::class.java))
            "Orthopedic Surgeon" ->
                startActivity(Intent(this@MainActivity, OrthopedicSurgeonActivity::class.java))
            "ENT Specialist" ->
                startActivity(Intent(this@MainActivity, ENTSpecialistActivity::class.java))
            "Urologist" ->
                startActivity(Intent(this@MainActivity, UrologistActivity::class.java))
            "Dentist" ->
                startActivity(Intent(this@MainActivity, DentistActivity::class.java))
            "Gastroenterologist" ->
                startActivity(Intent(this@MainActivity, GastroenterologistActivity::class.java))
            "Dermatologist" ->
                startActivity(Intent(this@MainActivity, DermatologistActivity::class.java))
            "Pediatrician" ->
                startActivity(Intent(this@MainActivity, PediatricianActivity::class.java))
            "Neonatologist" ->
                startActivity(Intent(this@MainActivity, NeonatologistActivity::class.java))
            "Psychiatrist" ->
                startActivity(Intent(this@MainActivity, PhysiotherapistActivity::class.java))
            "Nephrologist" ->
                startActivity(Intent(this@MainActivity, NephrologistActivity::class.java))
            "Ophthalmologists" ->
                startActivity(Intent(this@MainActivity, OphthalmologistsActivity::class.java))
            "Endocrinologist" ->
                startActivity(Intent(this@MainActivity, EndocrinologistActivity::class.java))
            "Sexologist" ->
                startActivity(Intent(this@MainActivity, SexologistActivity::class.java))
            "General Medicine" ->
                startActivity(Intent(this@MainActivity, GeneralMedicineActivity::class.java))
            "Physiotherapist" ->
                startActivity(Intent(this@MainActivity, PhysiotherapistActivity::class.java))
        }
    }
}