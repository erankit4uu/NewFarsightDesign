package com.ankit.demofarproject.view.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ankit.demofarproject.R
import com.ankit.demofarproject.databinding.ItemInnerRecyclerBinding
import com.ankit.demofarproject.model.MenuModel
import com.squareup.picasso.Picasso

class InnerRecyclerAdapter(var context: Context, var mainList: List<MenuModel.InnerMenuModel>)
    : RecyclerView.Adapter<InnerRecyclerAdapter.MyViewHolder>() {
    lateinit var binding: ItemInnerRecyclerBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflator = LayoutInflater.from(context)
        binding = DataBindingUtil.inflate(inflator, R.layout.item_inner_recycler, parent, false)
        return MyViewHolder(binding.root)
    }

    override fun getItemCount(): Int {
        return mainList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(mainList[position])
    }


    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(item : MenuModel.InnerMenuModel){
            binding.textTitle.text = item.title
            Picasso.get()
                .load(item.image)
                .placeholder(R.drawable.leave)
                .into(binding.imageIcon)
        }
    }
}