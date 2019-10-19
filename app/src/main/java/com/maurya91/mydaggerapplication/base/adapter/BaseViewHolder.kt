package com.maurya91.mydaggerapplication.base.adapter

import android.view.View

abstract class BaseViewHolder<M>(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {
    abstract fun onBind(item:M)
}