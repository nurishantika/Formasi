package com.example.formasi2.ui.internship

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.formasi2.R
import kotlinx.android.synthetic.main.internship_list_item.view.*

class InternshipAdapter (val internshipItemList: List<InternshipData>, val clickListener: (InternshipData) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.internship_list_item, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(internshipItemList[position], clickListener)
    }

    override fun getItemCount() = internshipItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(internship: InternshipData, clickListener: (InternshipData) -> Unit) {
            itemView.internshipName.text = internship.InternshipNama
            itemView.internshipJob.text = internship.InternshipJob
            itemView.internshipPhoto.setImageResource(internship.InternshipPhoto)
            itemView.internshipDate.text = internship.InternshipDate
            itemView.setOnClickListener { clickListener(internship) }
        }
    }
}
