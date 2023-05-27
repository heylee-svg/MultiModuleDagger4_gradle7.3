package cn.hx.news

import android.os.Bundle
import cn.hx.base.BaseActivity
import cn.hx.news.databinding.ActivityNewsBinding
import javax.inject.Inject

class NewsActivity : BaseActivity() {

    @Inject
    lateinit var set: Set<String>
    lateinit  var _binding :ActivityNewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityNewsBinding.inflate(layoutInflater)
        setContentView(_binding.root)
        _binding.text.text = set.toString()
    }
}