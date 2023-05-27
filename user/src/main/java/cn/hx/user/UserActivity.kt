package cn.hx.user

import android.os.Bundle
import cn.hx.base.BaseActivity
import cn.hx.user.databinding.ActivityUserBinding

import javax.inject.Inject

class UserActivity : BaseActivity() {

    @Inject
    lateinit var set: Set<String>
    lateinit  var _binding :ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        _binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(_binding.root)
        _binding.text.text = set.toString()
    }
}