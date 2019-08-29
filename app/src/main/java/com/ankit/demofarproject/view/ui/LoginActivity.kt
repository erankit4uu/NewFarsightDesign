package com.ankit.demofarproject.view.ui

import android.content.Intent
import android.os.Bundle
import com.ankit.demofarproject.R
import com.ankit.demofarproject.databinding.ActivityLoginBinding
import com.ankit.demofarproject.view.ui.base.BaseAppActivity
import com.ankit.demofarproject.view.ui.home.HomeActivity

class LoginActivity : BaseAppActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = binding(R.layout.activity_login) as ActivityLoginBinding
        binding.btnConnect.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}