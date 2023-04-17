package com.example.latihanpermission

import android.content.Context
import android.net.wifi.WifiManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.latihanpermission.databinding.ActivityHomeBinding

class WifiPermissionActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding
    lateinit var wifiManager: WifiManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "KotlinApp"

        wifiManager = applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager


        binding.btnWifiOn.setOnClickListener {
            enableWifi()
        }
        binding.btnWifiOff.setOnClickListener {
            disableWifi()
        }
    }

    private fun enableWifi() {
        wifiManager.isWifiEnabled = true
        Toast.makeText(this, "Wifi enabled", Toast.LENGTH_SHORT).show()
    }
    private fun disableWifi() {
        wifiManager.isWifiEnabled = false
        Toast.makeText(this, "Wifi disabled", Toast.LENGTH_SHORT).show()
    }
}