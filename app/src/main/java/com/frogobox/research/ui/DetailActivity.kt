package com.frogobox.research.ui

import android.os.Bundle
import com.frogobox.research.core.BaseBindActivity
import com.frogobox.research.databinding.ActivityDetailBinding

class DetailActivity : BaseBindActivity<ActivityDetailBinding>() {

    companion object {
        private val TAG: String = DetailActivity::class.java.simpleName
    }

    override fun initBinding(): ActivityDetailBinding {
        return ActivityDetailBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // TODO : Add your code here

    }

    override fun initView() {
        binding.apply {

        }
    }

}