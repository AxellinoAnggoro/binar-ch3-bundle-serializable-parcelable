package com.axellinoanggoro.ch3_latihan1_latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.axellinoanggoro.ch3_latihan1_latihan2.databinding.ActivityDuaLatihanParcelableBinding

class ActivityDuaLatihanParcelable : AppCompatActivity() {

    lateinit var binding : ActivityDuaLatihanParcelableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDuaLatihanParcelableBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getDataParcel = intent.getParcelableExtra<ParcelableData>("DATAPARCEL")
        val namaParcel = getDataParcel?.name
        val emailParcel = getDataParcel?.email
        val phoneParcel = getDataParcel?.phone
        val addressParcel = getDataParcel?.address
        val ageParcel = getDataParcel?.age

        binding.viewNameParcel.text = namaParcel
        binding.viewEmailParcel.text = emailParcel
        binding.viewPhoneParcel.text = phoneParcel
        binding.viewAddressParcel.text = addressParcel
        binding.viewAgeParcel.text = ageParcel.toString()
    }
}