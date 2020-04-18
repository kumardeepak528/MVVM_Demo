package com.dpk.mvvmdemo.viewmodel

import android.view.View
import androidx.lifecycle.ViewModel
import com.dpk.mvvmdemo.data.listeners.ILoginListener
import com.dpk.mvvmdemo.utils.hideKeyboard

class LoginViewModel : ViewModel() {
    var emailId : String?=null
    var password : String?=null

    lateinit var loginListener : ILoginListener



    fun onLoginClicked(view : View){
        view.hideKeyboard()
        if(emailId.isNullOrEmpty()){
            loginListener.onError("Email Id Required")
            return
        }
        if(password.isNullOrEmpty()){
            loginListener.onError("Password Required")
            return
        }
        loginListener.onSuccess()

    }
}