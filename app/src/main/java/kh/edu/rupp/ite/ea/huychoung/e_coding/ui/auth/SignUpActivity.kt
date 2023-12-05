package kh.edu.rupp.ite.ea.huychoung.e_coding.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kh.edu.rupp.ite.ea.huychoung.e_coding.R
import kh.edu.rupp.ite.ea.huychoung.e_coding.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // set onclickListener from txtLogin to LoginActivity
        binding.txtLogin.setOnClickListener {
            finish()
        }
    }
}