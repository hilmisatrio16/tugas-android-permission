package com.example.latihanpermission

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.bumptech.glide.Glide
import com.example.latihanpermission.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPindahAcitivityWifi.setOnClickListener {
            startActivity(Intent(this, WifiPermissionActivity::class.java))
        }


        binding.btnPindahAcivityGallery.setOnClickListener {
            startActivity(Intent(this, CameraAndGalleryActivity::class.java))
        }

        binding.btnPindahActivityLocation.setOnClickListener {
            startActivity(Intent(this, DangerousFindLocationActivity::class.java))
        }

        binding.btnInternetPermission.setOnClickListener {
            startActivity(Intent(this, InternetPermissionActivity::class.java))
        }



    }

}