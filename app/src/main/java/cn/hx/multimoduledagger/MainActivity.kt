package cn.hx.multimoduledagger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cn.hx.multimoduledagger.databinding.ActivityMainBinding
import cn.hx.news.NewsActivity



import cn.hx.user.UserActivity

class MainActivity : AppCompatActivity() {
     var _binding :ActivityMainBinding ? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding!!.root)
        _binding!!.btnUser.setOnClickListener {
            startActivity(Intent(this, UserActivity::class.java))
        }
        _binding!!.btnNews.setOnClickListener {
            startActivity(Intent(this, NewsActivity::class.java))
        }
    }
}