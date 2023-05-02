package com.example.activity3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.activity3.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    private lateinit var registerSuccessfullyButton: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        registerSuccessfullyButton()

        binding.btnRegisterBack.setOnClickListener {
            val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
            startActivity(intent)
        }
    }

    private fun registerSuccessfullyButton() {
        registerSuccessfullyButton = findViewById(R.id.btn_register2)
        registerSuccessfullyButton.setOnClickListener {
            val intent = Intent(this, RegisterSplashScreenActivity::class.java)
            startActivity(intent)
        }
    }
}