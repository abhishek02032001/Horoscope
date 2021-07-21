package com.example.horoscope.services

import android.content.Context
import android.content.Intent
import android.util.Log
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.example.horoscope.Horoscope

class HoroscopeData(var context: Context, var sign: String) {

    fun fetchData(){
        var url = "https://ohmanda.com/api/horoscope/$sign"
        val queue = Volley.newRequestQueue(context)

        val jsonObjectRequest = JsonObjectRequest(
            Request.Method.GET, url, null,
            { response ->
                val i = Intent(context, Horoscope::class.java)
                i.putExtra("desc", response.getString("horoscope"))
                i.putExtra("img", sign)
                context.startActivity(i)
            },
            { error ->
                Log.i("Res", error.toString())
            }
        )
        queue.add(jsonObjectRequest)
    }

}