package com.example.formasi2.ui.seminar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.formasi2.R
import kotlinx.android.synthetic.main.seminar_list_item.view.*

class SeminarAdapter (val seminarItemList: List<SeminarData>, val clickListener: (SeminarData) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.seminar_list_item, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(seminarItemList[position], clickListener)
    }

    override fun getItemCount() = seminarItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(seminar: SeminarData, clickListener: (SeminarData) -> Unit) {
            itemView.seminarNama.text = seminar.SeminarNama
            itemView.seminarDate.text = seminar.SeminarDate
            itemView.seminarPhoto.setImageResource(seminar.SeminarPhoto)
            itemView.setOnClickListener { clickListener(seminar) }
        }
    }
}