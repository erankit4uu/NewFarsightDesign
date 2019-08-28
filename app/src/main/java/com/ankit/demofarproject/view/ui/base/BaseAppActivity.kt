package com.ankit.demofarproject.view.ui.base

import android.content.Context
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
abstract class BaseAppActivity : AppCompatActivity() {
    lateinit var binding: ViewDataBinding;

    fun binding(layout: Int): ViewDataBinding {
        binding = DataBindingUtil.setContentView(this, layout)
        return binding
    }

    fun binding(layout: Int, viewModel: ViewModel) : ViewDataBinding{
        return binding
    }

    fun showShortToast(msg : String){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    fun showLongToast(msg : String){
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }
}