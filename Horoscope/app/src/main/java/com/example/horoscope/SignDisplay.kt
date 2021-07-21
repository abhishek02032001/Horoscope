package com.example.horoscope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.horoscope.adapter.SignAdapter
import com.example.horoscope.models.SignModel
import kotlinx.android.synthetic.main.activity_sign_display.*

class SignDisplay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_display)

        var list: ArrayList<SignModel> = ArrayList()
        list.add(SignModel("Aquarius", R.drawable.aquarius))
        list.add(SignModel("Pisces", R.drawable.pisces))
        list.add(SignModel("Aries", R.drawable.aries))
        list.add(SignModel("Taurus", R.drawable.taurus))
        list.add(SignModel("Gemini", R.drawable.gemini))
        list.add(SignModel("Cancer", R.drawable.cancer))
        list.add(SignModel("Leo", R.drawable.leo))
        list.add(SignModel("Virgo", R.drawable.virgo))
        list.add(SignModel("Libra", R.drawable.libra))
        list.add(SignModel("Scorpio", R.drawable.scorpio))
        list.add(SignModel("Sagittarius", R.drawable.sagittarius))
        list.add(SignModel("Capricorn", R.drawable.capricorn))

        var signLayoutManager = GridLayoutManager(this, 3, LinearLayoutManager.VERTICAL, false)
        signListId.layoutManager = signLayoutManager

        var signAdapter = SignAdapter(this, list)
        signListId.adapter = signAdapter
    }
}