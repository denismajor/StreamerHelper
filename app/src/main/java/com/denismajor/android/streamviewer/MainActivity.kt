package com.denismajor.android.streamviewer

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.webkit.WebView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        webViewSetup()
    }

    private fun webViewSetup () {
        val myWebView1: WebView = findViewById(R.id.wb_FirstWindow)
        val myWebView2: WebView = findViewById(R.id.wb_SecondWindow)
        val myWebView3: WebView = findViewById(R.id.wb_ThirdWindow)
        myWebView1.settings.javaScriptEnabled = true
        myWebView2.settings.javaScriptEnabled = true
        myWebView3.settings.javaScriptEnabled = true
        //myWebView3.settings.textZoom = 200
        myWebView1.setBackgroundColor(Color.DKGRAY)
        myWebView2.setBackgroundColor(Color.DKGRAY)
        myWebView3.setBackgroundColor(Color.DKGRAY)
        //myWebView1.loadUrl("https://www.donationalerts.com/widget/alerts?group_id=1&token=6eIJTmLGyjwVwGsIYSjn")
        myWebView1.loadUrl(R.string.widget1_url.toString())
        //myWebView2.loadUrl("https://www.donationalerts.com/widget/instream-stats?id=286744&token=6eIJTmLGyjwVwGsIYSjn")
        myWebView2.loadUrl(R.string.widget2_url.toString())
        //myWebView3.loadUrl("http://192.168.31.128:8383/themes/deepblue/template.html?sm=false&aic=true")
        myWebView3.loadUrl(R.string.chat_widget_url.toString())
    }
}