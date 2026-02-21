package com.example.numbersapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.numbersapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val englishNums = listOf<String>("One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten")
        val arabicNums = listOf<String>("واحد","اثنان","ثلاثه","اربعه","خمسه","سته","سبعه","ثمانيه","تسعه","عشره")
        val numImage = listOf(R.drawable.number_one, R.drawable.number_two,R.drawable.number_three,R.drawable.number_four,R.drawable.number_five,R.drawable.number_six,R.drawable.number_seven,R.drawable.number_eight,R.drawable.number_nine,R.drawable.number_ten)

        binding.NumbersRV.layoutManager = LinearLayoutManager(this)
        binding.NumbersRV.adapter = NumbersAdapter(englishNums,arabicNums,numImage)
    }
}