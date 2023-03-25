package com.axellinoanggoro.ch3_latihan1_latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.axellinoanggoro.ch3_latihan1_latihan2.databinding.ActivityLatihanDuaBinding
import com.axellinoanggoro.ch3_latihan1_latihan2.databinding.ActivityLatihanSatuBinding

class LatihanDua : AppCompatActivity() {
    lateinit var binding : ActivityLatihanDuaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLatihanDuaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saveBtn.setOnClickListener {
            val name = binding.inputName.text.toString()
            val email = binding.inputEmail.text.toString()
            val phone = binding.inputPhone.text.toString()
            val address = binding.inputAddress.text.toString()
            val age = binding.inputAge.text.toString()

            val data = Data(name, email, phone, address, age.toInt())
            val intent = Intent(this, ActivityDuaLatihanDua::class.java)
            intent.putExtra("DATASERIAL", data)
            startActivity(intent)
        }
    }
}