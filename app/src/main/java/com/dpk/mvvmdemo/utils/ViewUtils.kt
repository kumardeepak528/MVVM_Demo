package com.dpk.mvvmdemo.utils

import android.app.Activity
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.google.android.material.snackbar.Snackbar


fun View.snackBar(message : String){
    Snackbar.make(this,message,Snackbar.LENGTH_SHORT).show()
}


fun View.hideKeyboard() {
    val imm: InputMethodManager =
        context.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(this.windowToken, 0)
}