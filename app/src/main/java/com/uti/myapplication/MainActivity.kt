package com.uti.myapplication
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedPreferences = getSharedPreferences("loginPrefs", MODE_PRIVATE)

        findViewById<Button>(R.id.btnLogout).setOnClickListener {
            sharedPreferences.edit().clear().apply()
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }

        findViewById<Button>(R.id.btnBeli).setOnClickListener {
            Toast.makeText(this, "Produk ditambahkan ke keranjang!", Toast.LENGTH_SHORT).show()
        }
    }
}
