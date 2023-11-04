package kh.edu.rupp.ite.ea.huychoung.e_coding.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kh.edu.rupp.ite.ea.huychoung.e_coding.R
import kh.edu.rupp.ite.ea.huychoung.e_coding.databinding.ActivityStartingBinding
import kh.edu.rupp.ite.ea.huychoung.e_coding.ui.auth.LoginActivity

class StartingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartingBinding
    private lateinit var btnGetStart: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // TODO: code here.
        getStartButton()
    }

    private fun getStartButton() {
        btnGetStart = binding.btnGetStart
        btnGetStart.setOnClickListener { startActivity(Intent(this@StartingActivity, LoginActivity::class.java)) }
    }
}