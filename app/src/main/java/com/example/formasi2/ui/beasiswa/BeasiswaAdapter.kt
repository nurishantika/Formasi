package com.example.formasi2.ui.beasiswa

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.formasi2.R
import kotlinx.android.synthetic.main.beasiswa_list_item.view.*

class BeasiswaAdapter (val beasiswaItemList: List<BeasiswaData>, val clickListener: (BeasiswaData) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.beasiswa_list_item, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(beasiswaItemList[position], clickListener)
    }

    override fun getItemCount() = beasiswaItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(beasiswa: BeasiswaData, clickListener: (BeasiswaData) -> Unit) {
            itemView.beasiswaName.text = beasiswa.BeasiswaNama
            itemView.beasiswaDate.text = beasiswa.BeasiswaDate
            itemView.beasiswaPhoto.setImageResource(beasiswa.BeasiswaPhoto)
            itemView.setOnClickListener { clickListener(beasiswa) }
        }
    }
}