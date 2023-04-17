package com.example.latihanpermission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.latihanpermission.databinding.ActivityInternetPermissionBinding

class InternetPermissionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInternetPermissionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInternetPermissionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNormalPermission.setOnClickListener {
            Glide.with(this)
                .load("https://i.ibb.co/zJHYGBP/binarlogo.jpg")
                .circleCrop()
                .into(binding.imgBinar)
        }
    }
}