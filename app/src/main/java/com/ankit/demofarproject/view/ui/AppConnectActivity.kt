package com.ankit.demofarproject.view.ui

import android.content.Intent
import android.os.Bundle
import com.ankit.demofarproject.R
import com.ankit.demofarproject.databinding.ActivityLoginBinding
import com.ankit.demofarproject.databinding.ActivityMainBinding
import com.ankit.demofarproject.view.ui.base.BaseAppActivity

class AppConnectActivity : BaseAppActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = binding(R.layout.activity_main) as ActivityMainBinding
        binding.btnConnect.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }


    }
}