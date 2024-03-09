package com.example.foodorderingapp
import com.example.foodorderingapp.SignActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent  // Import Intent for creating intents
import com.example.foodorderingapp.databinding.ActivityLoginBinding  // Import the binding class

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding  // Use lateinit for binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)  // Initialize binding
        setContentView(binding.root)

        binding.button3.setOnClickListener {//login button eke id assign karnne
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
