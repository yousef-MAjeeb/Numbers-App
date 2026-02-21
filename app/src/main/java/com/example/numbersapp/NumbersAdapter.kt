package com.example.numbersapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumbersAdapter(val englishData: List<String>, val arabicData: List<String>, val imageData: List<Int>): RecyclerView.Adapter<NumbersAdapter.MyViewHolder>() {

    class MyViewHolder(val item: View): RecyclerView.ViewHolder(item){
        val englishNumberTextView = item.findViewById<TextView>(R.id.englishNum)
        val arabicNumberTextView = item.findViewById<TextView>(R.id.arabicNum)
        val numberImage = item.findViewById<ImageView>(R.id.numberImage)


    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NumbersAdapter.MyViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.numbers_card, parent,false)
        return MyViewHolder(layout)
    }

    override fun onBindViewHolder(holder: NumbersAdapter.MyViewHolder, position: Int) {
        holder.englishNumberTextView.text = englishData[position]
        holder.arabicNumberTextView.text = arabicData[position]
        holder.numberImage.setImageResource(imageData[position])
    }

    override fun getItemCount(): Int {
        return englishData.size
    }
}