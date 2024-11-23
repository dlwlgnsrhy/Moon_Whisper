package com.example.moonwhisperapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.moonwhisperapp.ui.theme.MoonWhisperAppTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)  // AppCompat 테마 설정
        super.onCreate(savedInstanceState)

        // XML 레이아웃 사용
        setContentView(R.layout.activity_main)
    }
}