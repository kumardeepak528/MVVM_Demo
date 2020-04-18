package com.dpk.mvvmdemo.data.listeners

interface ILoginListener {
    fun onSuccess()
    fun onError(errorMessage: String)
}