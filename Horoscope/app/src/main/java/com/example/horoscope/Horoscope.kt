package com.example.horoscope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.horoscope.services.HoroscopeData
import kotlinx.android.synthetic.main.activity_horoscope.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.description
import java.util.*

class Horoscope : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_horoscope)

        val i = intent.extras
        val descr : String? = i?.getString("desc")
        val img = i?.getString("img")
        description.text = descr

        when(img) {
            "leo" -> signImage.setImageResource(R.drawable.leo)
            "cancer" -> signImage.setImageResource(R.drawable.cancer)
            "aquarius" -> signImage.setImageResource(R.drawable.aquarius)
            "sagittarius" -> signImage.setImageResource(R.drawable.sagittarius)
            "scorpio" -> signImage.setImageResource(R.drawable.scorpio)
            "taurus" -> signImage.setImageResource(R.drawable.taurus)
            "pisces" -> signImage.setImageResource(R.drawable.pisces)
            "aries" -> signImage.setImageResource(R.drawable.aries)
            "gemini" -> signImage.setImageResource(R.drawable.gemini)
            "libra" -> signImage.setImageResource(R.drawable.libra)
            "capricorn" -> signImage.setImageResource(R.drawable.capricorn)
            "virgo" -> signImage.setImageResource(R.drawable.virgo)
        }
    }
}