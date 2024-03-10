package com.example.foodorderingapp
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.foodorderingapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding  // Use lateinit for binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)  // Initialize binding
        setContentView(binding.root)
        //login button eke id assign karnne
        binding.button3.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)  // Create Intent correctly
            startActivity(intent)
        }
// create account wlata yanava
        binding.textView3.setOnClickListener {  // Correct listener name
            val intent = Intent(this,SignActivity::class.java)
            startActivity(intent)
        }
    }
}
