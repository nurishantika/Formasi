package com.example.formasi2.ui.informasi

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.formasi2.R
import com.example.formasi2.ui.profil.ProfilViewModel

class InformasiFragment : Fragment() {

    private lateinit var informasiViewModel: InformasiViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? { informasiViewModel =
            ViewModelProviders.of(this).get(InformasiViewModel::class.java)
        val root = inflater.inflate(R.layout.info_fragment, container, false)
        return root
    }
}