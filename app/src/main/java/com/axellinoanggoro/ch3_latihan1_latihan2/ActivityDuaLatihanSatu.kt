package com.axellinoanggoro.ch3_latihan1_latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.axellinoanggoro.ch3_latihan1_latihan2.databinding.ActivityDuaLatihanSatuBinding

class ActivityDuaLatihanSatu : AppCompatActivity() {

    lateinit var binding : ActivityDuaLatihanSatuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDuaLatihanSatuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getBundleData = intent.extras
        val name = getBundleData?.getString("name")
        val year = getBundleData?.getInt("year")

        binding.bViewName.text = "Halo " + name
        binding.bViewYear.text = "Umur kamu " + year
    }
}