package kh.edu.rupp.ite.ea.huychoung.e_coding.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kh.edu.rupp.ite.ea.huychoung.e_coding.MainActivity
import kh.edu.rupp.ite.ea.huychoung.e_coding.R
import kh.edu.rupp.ite.ea.huychoung.e_coding.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this@LoginActivity, MainActivity::class.java))
        }
    }
}