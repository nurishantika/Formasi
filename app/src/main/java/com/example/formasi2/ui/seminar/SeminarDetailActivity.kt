package com.example.formasi2.ui.seminar

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.formasi2.R
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.seminar_content_detail.*

class SeminarDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.seminar_activity_detail)
        supportActionBar?.setDisplayHomeAsUpEnabled(false)

        var intentThatStartedThisActivity = intent
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_COMPONENT_NAME)) {
            putData(intentThatStartedThisActivity)
        }
    }

    private fun putData(intentThatStartedThisActivity : Intent) {
        var photo = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SPLIT_NAME)?.toInt()
        var nama = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_COMPONENT_NAME)
        var date = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_INSTALLER_PACKAGE_NAME)
        var deskripsi= intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_EXCLUDE_COMPONENTS)
        var link = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_REFERRER_NAME)

        if (photo != null) {
            SeminarPhotoDetail.setImageResource(photo)
        }
        SeminarNama.text = nama
        SeminarDate.text = date
        SeminarDeskripsiDetail.text = deskripsi

        buttonLink.setOnClickListener {
            if (link != null) {
                openWeb(link)
            }
        }
    }

    private fun openWeb(url: String) {
        val showWebActivity = Intent(this, SeminarLink::class.java)
        showWebActivity.putExtra(Intent.ACTION_WEB_SEARCH, url)
        startActivity(showWebActivity)
    }
}