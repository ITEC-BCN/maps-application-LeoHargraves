package com.example.mapsapp.ui.Supabase

import android.net.http.HttpResponseCache.install

class Client {
    lateinit var client: SupabaseClient
    constructor(supabaseUrl: String, supabaseKey: String): this(){
        client = createSupabaseClient(
            supabaseUrl = supabaseUrl,
            supabaseKey = supabaseKey
        ) {
            install(Postgrest)
        }
    }
    //SQL operations

}