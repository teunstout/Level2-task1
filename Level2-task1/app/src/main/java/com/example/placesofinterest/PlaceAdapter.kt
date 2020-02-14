package com.example.placesofinterest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_place.view.*

class PlaceAdapter(val places: ArrayList<Place>): RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {

    inner class ViewHolder(textview : View): RecyclerView.ViewHolder(textview){
        fun bind(place: Place){
            itemView.placeTitle.text = place.name
            itemView.placeImg.setImageResource(place.imgResId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_place, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return places.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(places[position])
    }
}