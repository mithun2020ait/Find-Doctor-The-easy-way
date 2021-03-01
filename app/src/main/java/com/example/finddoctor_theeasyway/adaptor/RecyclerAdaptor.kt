package com.example.finddoctor_theeasyway.adaptor

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.finddoctor_theeasyway.R
import com.example.finddoctor_theeasyway.model.SpecialModel

class RecyclerAdaptor(private val context: Context, private val specialization: ArrayList<SpecialModel>, private val listener: ClickedListener):
        RecyclerView.Adapter<RecyclerAdaptor.ItemViewHolder>() {

    private var specialList = ArrayList<SpecialModel>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val viewHolder: View = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(viewHolder)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val itemList = specialList[position]
        holder.textView.text = itemList.Specialization
        holder.imageView.setImageResource(itemList.Image)
        holder.itemView.setOnClickListener {
            listener.onItemClicked(itemList)
        }
        holder.cardView.animation = AnimationUtils.loadAnimation(holder.itemView.context, R.anim.anim)

    }

    override fun getItemCount(): Int {
        return specialization.size
    }

    fun setData(specialList: ArrayList<SpecialModel>) {
        this.specialList = specialList

    }

    inner class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val textView: TextView = itemView.findViewById(R.id.specialization)
        val imageView: ImageView = itemView.findViewById(R.id.special_image)
        val cardView: CardView = itemView.findViewById(R.id.card_view)
    }


    interface ClickedListener {
        fun onItemClicked(specialModel: SpecialModel)
    }



}



