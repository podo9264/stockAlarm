package com.wbj.stockalarm.view.adapter

import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.wbj.stockalarm.R

import com.wbj.stockalarm.data.transfer_object.CurrentStock
import com.wbj.stockalarm.data.transfer_object.CustomPrice
import com.wbj.stockalarm.databinding.ListOnlyReadStockBinding

class OnlyReadAdapter : RecyclerView.Adapter<OnlyReadAdapter.CardHolder>() {
    var mDatas = ArrayList<CustomPrice>()

    fun setData(list:ArrayList<CustomPrice>?){
        val item1 = CustomPrice(1100)
        item1.mName = "NHN"
        item1.mCurrentPrize = 26200
        mDatas.add(item1)

        val item2 = CustomPrice(1101)
        item2.mName = "이노와이어리스"
        item2.mCurrentPrize = 33200
        mDatas.add(item2)

        val item3 = CustomPrice(1102)
        item3.mName = "수산인더스트리"
        item3.mCurrentPrize = 25300
        mDatas.add(item3)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHolder {
        val binding = ListOnlyReadStockBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CardHolder(binding)
    }

    override fun onBindViewHolder(holder: CardHolder, position: Int) {
        holder.bind(mDatas.get(position))
    }

    override fun getItemCount(): Int {
        return mDatas.size
    }


    inner class CardHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var mBinding: ListOnlyReadStockBinding

        constructor(item: ListOnlyReadStockBinding) : this(item.root) {
            mBinding = item
        }

        fun bind(item:CurrentStock) {
            mBinding.tvTitle.setText(item.mName)
            mBinding.tvCurrentPrice.setText(item.mCurrentPrize.toString())
        }
    }

}