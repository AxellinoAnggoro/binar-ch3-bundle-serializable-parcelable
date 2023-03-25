package com.axellinoanggoro.ch3_latihan1_latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.axellinoanggoro.ch3_latihan1_latihan2.databinding.ActivityLatihanParcelableBinding

class LatihanParcelable : AppCompatActivity() {
    lateinit var binding : ActivityLatihanParcelableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLatihanParcelableBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saveBtnParcel.setOnClickListener {
            val name = binding.inputNameParcel.text.toString()
            val email = binding.inputEmailParcel.text.toString()
            val phone = binding.inputPhoneParcel.text.toString()
            val address = binding.inputAddressParcel.text.toString()
            val age = binding.inputAgeParcel.text.toString()

            val data = ParcelableData(name, email, phone, address, age.toInt())
            val intent = Intent(this, ActivityDuaLatihanParcelable::class.java)
            intent.putExtra("DATAPARCEL", data)
            startActivity(intent)
        }
    }

}