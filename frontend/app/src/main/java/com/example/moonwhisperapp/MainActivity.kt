package com.example.moonwhisperapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.moonwhisperapp.ui.theme.CalendarFragment
import com.example.moonwhisperapp.ui.theme.DiaryFragment
import com.example.moonwhisperapp.ui.theme.HomeFragment
import com.example.moonwhisperapp.ui.theme.MoonWhisperAppTheme
import com.example.moonwhisperapp.ui.theme.SettingFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)  // AppCompat 테마 설정
        super.onCreate(savedInstanceState)
        // XML 레이아웃 사용
        setContentView(R.layout.activity_main)

        //BottomNavigationView 설정
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        // 기본 Fragment 설정
        if(savedInstanceState ==null){  //앱 시작시 or 화면 전환 -액티비티 새로 생성시
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment())
                .commit()
        }

        //아이템 클릭 이벤트 리스너
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId){
                R.id.nav_home -> {
                    loadFragment(HomeFragment())
                    true
                }
                R.id.nav_diary ->{
                    loadFragment(DiaryFragment())
                    true
                }
                R.id.nav_calendar->{
                    loadFragment(CalendarFragment())
                    true
                }
                R.id.nav_settings->{
                    loadFragment(SettingFragment())
                    true
                }
                else -> false
            }
        }

    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}