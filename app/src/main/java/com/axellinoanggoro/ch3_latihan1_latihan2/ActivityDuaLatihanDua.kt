package com.axellinoanggoro.ch3_latihan1_latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.axellinoanggoro.ch3_latihan1_latihan2.databinding.ActivityDuaLatihanDuaBinding

class ActivityDuaLatihanDua : AppCompatActivity() {

    private lateinit var binding : ActivityDuaLatihanDuaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDuaLatihanDuaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getDataSerial = intent.getSerializableExtra("DATASERIAL") as Data
        val namaSerial = getDataSerial.name
        val emailSerial = getDataSerial.email
        val phoneSerial = getDataSerial.phone
        val addressSerial = getDataSerial.address
        val ageSerial = getDataSerial.age

        binding.viewName.text = namaSerial
        binding.viewEmail.text = emailSerial
        binding.viewPhone.text = phoneSerial
        binding.viewAddress.text = addressSerial
        binding.viewAge.text = ageSerial.toString()

    }
}