package com.wbj.stockalarm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.wbj.stockalarm.R
import com.wbj.stockalarm.databinding.ActivityMainBinding
import com.wbj.stockalarm.view.adapter.OnlyReadAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding:ActivityMainBinding
    private val mAdapter: OnlyReadAdapter = OnlyReadAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        mAdapter.setData(null)
        mBinding.rvStock.adapter = mAdapter
        mBinding.rvStock.layoutManager = LinearLayoutManager(baseContext)
        mBinding.rvStock.setHasFixedSize(true)


    }
}