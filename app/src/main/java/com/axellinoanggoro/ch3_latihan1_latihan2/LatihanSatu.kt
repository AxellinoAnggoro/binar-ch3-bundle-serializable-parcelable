package com.axellinoanggoro.ch3_latihan1_latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.axellinoanggoro.ch3_latihan1_latihan2.databinding.ActivityLatihanSatuBinding

class LatihanSatu : AppCompatActivity() {
    lateinit var binding : ActivityLatihanSatuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLatihanSatuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bSaveBtn.setOnClickListener {
            val inputName = binding.bInputName.text.toString()
            val inputDob = binding.bInputDate.text.toString().toInt()

            val intent = Intent(this, ActivityDuaLatihanSatu::class.java)
            val bundle = Bundle()
            val year = 2023 - inputDob

            bundle.putString("name",inputName)
            bundle.putInt("year", year)
            intent.putExtras(bundle)
            startActivity(intent)
        }


    }
}