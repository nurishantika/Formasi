package com.example.formasi2.ui.beasiswa

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.webkit.JsResult
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.formasi2.R

class BeasiswaLink : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.beasiswa_website)
        val webView = findViewById<WebView>(R.id.beasiswaLink)
        actionBar?.setDisplayHomeAsUpEnabled(false)
        var intentThatStartedThisActivity = intent

        if(intentThatStartedThisActivity.hasExtra(Intent.ACTION_WEB_SEARCH)) {
            var beasiswaLink = intentThatStartedThisActivity.getStringExtra(Intent.ACTION_WEB_SEARCH).toString()
            webView.settings.javaScriptEnabled = true
            webView.webViewClient = object  : WebViewClient() {
                override fun onPageFinished(view: WebView?, url: String?) {
                    if (view != null) {
                        view.loadUrl("javascript:alert('Web on load...')")
                    }
                }
            }
            webView.webChromeClient = object : WebChromeClient() {
                override fun onJsAlert(
                        view: WebView?,
                        url: String?,
                        message: String?,
                        result: JsResult?
                ): Boolean {
                    Toast.makeText(this@BeasiswaLink, message, Toast.LENGTH_LONG).show()
                    if (result != null) {
                        result.confirm() }
                    return true
                }
            }
            webView.loadUrl(beasiswaLink)
        } else {
        }
    }
}