package com.hamza.mvp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hamza.mvp.R
import com.hamza.mvp.databinding.ActivityMainBinding
import com.hamza.mvp.models.domains.User
import com.hamza.mvp.models.domains.Wisdom
import com.hamza.mvp.presenter.MainPresenter

class MainActivity : AppCompatActivity(), IMainView {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    private val presenter = MainPresenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding?.root)
        setup()
        actions()
    }

    private fun setup() {
        presenter.view=this
        presenter.getUserInfo()
    }

    private fun actions() {
        binding.btnFetch.setOnClickListener {
            presenter.fetchWisdom()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onUSerInfo(user: User) {
        binding.txtUsername.text = user.name
    }

    override fun onFetchWisdom(wisdom: Wisdom) {
        binding.apply {
            txtContent.text = wisdom.content
            txtDate.text = wisdom.date
        }
    }
}