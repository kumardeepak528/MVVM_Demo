package com.dpk.mvvmdemo.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.dpk.mvvmdemo.ui.home.MainActivity
import com.dpk.mvvmdemo.R
import com.dpk.mvvmdemo.data.listeners.ILoginListener
import com.dpk.mvvmdemo.databinding.ActivityLoginBinding
import com.dpk.mvvmdemo.viewmodel.LoginViewModel
import com.dpk.mvvmdemo.viewmodel.LoginViewModelFactory
import com.dpk.mvvmdemo.utils.snackBar
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(),ILoginListener{

    var loginViewModel : LoginViewModel?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Binding
        val binding: ActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)

        //View Model
        val loginViewModelFactory = LoginViewModelFactory()
        loginViewModel = ViewModelProvider(this,loginViewModelFactory).get(LoginViewModel::class.java)
        binding.viewmodel = loginViewModel
        loginViewModel!!.loginListener = this

    }

    override fun onSuccess() {
        startActivity(Intent(this@LoginActivity,
            MainActivity::class.java))
        finish()
    }

    override fun onError(errorMessage: String) {
        root_layout.snackBar(errorMessage)
    }
}
