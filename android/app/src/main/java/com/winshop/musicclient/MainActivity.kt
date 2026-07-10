package com.winshop.musicclient

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val webView = WebView(this).apply {
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true // Чтобы кэш и настройки работали корректно
            webViewClient = WebViewClient()
            
            // СЮДА ССЫЛКУ НА ТВОЙ GITHUB PAGES С ПЛЕЕРОМ
            loadUrl("https://WinShop31.github.io/music-client/")
        }
        
        setContentView(webView)
    }
}
