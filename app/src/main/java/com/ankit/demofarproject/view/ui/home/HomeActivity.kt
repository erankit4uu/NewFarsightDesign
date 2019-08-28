package com.ankit.demofarproject.view.ui.home

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ankit.demofarproject.R
import com.ankit.demofarproject.databinding.ActivityHomeBinding
import com.ankit.demofarproject.view.ui.base.BaseAppActivity

class HomeActivity : BaseAppActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = binding(R.layout.activity_home) as ActivityHomeBinding

        binding.mainRecycler.layoutManager = LinearLayoutManager(this)

    }

}