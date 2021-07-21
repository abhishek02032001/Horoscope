package com.example.horoscope.adapter

import android.content.Context
import android.content.Intent
import android.telecom.Call.Details
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.horoscope.Horoscope
import com.example.horoscope.R
import com.example.horoscope.models.SignModel
import com.example.horoscope.services.HoroscopeData
import java.util.*


class SignAdapter(var context:Context, var signList: ArrayList<SignModel>) :
    RecyclerView.Adapter<SignViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SignViewHolder {
        val itemHolder = LayoutInflater.from(context).inflate(R.layout.sign_view, parent, false)
        return SignViewHolder(itemHolder)
    }

    override fun onBindViewHolder(holder: SignViewHolder, position: Int) {
        var instanceSign:SignModel = signList[position]
        holder.titleTextView?.text  = instanceSign.title
        holder.imageImageView?.setImageResource(instanceSign.imageSource)
        holder.itemView.setOnClickListener {
            HoroscopeData(context, instanceSign.title.lowercase(Locale.getDefault())).fetchData()
        }
    }

    override fun getItemCount(): Int {
        return signList.size
    }
}

class SignViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var titleTextView: TextView? = itemView.findViewById<TextView>(R.id.signName)
    var imageImageView: ImageView? = itemView.findViewById<ImageView>(R.id.signImage)
}