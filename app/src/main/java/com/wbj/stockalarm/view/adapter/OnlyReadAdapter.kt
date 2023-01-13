package com.wbj.stockalarm.view.adapter

import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.wbj.stockalarm.data.transfer_object.CurrentStock

class OnlyReadAdapter : RecyclerView.Adapter<OnlyReadAdapter.CardHolder>() {
    var mDatas = ArrayList<CurrentStock>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CardHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return mDatas.size
    }


    inner class CardHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item:CurrentStock) {

        }
    }

}