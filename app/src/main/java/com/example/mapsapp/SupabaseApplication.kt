package com.example.mapsapp

import android.app.Application
import com.example.mapsapp.ui.Supabase.SupabaseManager

class SupabaseApplication: Application() {
    companion object{
        lateinit var supabase: SupabaseManager
    }
    override fun onCreate() {
        super.onCreate()
        supabase = SupabaseManager()
    }
}
