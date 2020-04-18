package com.dpk.mvvmdemo

import android.app.Application
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.dpk.mvvmdemo.utils.ThemeHelper

class Application : Application() {
    override fun onCreate() {
        super.onCreate()
        val sharedPreferences: SharedPreferences =
            PreferenceManager.getDefaultSharedPreferences(this)
        val themePref =
            sharedPreferences.getString("themePref", ThemeHelper.DEFAULT_MODE)
        ThemeHelper.applyTheme(themePref!!)
    }
}
