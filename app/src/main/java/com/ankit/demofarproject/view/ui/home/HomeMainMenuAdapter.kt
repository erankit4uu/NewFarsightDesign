package com.ankit.demofarproject.view.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ankit.demofarproject.R
import com.ankit.demofarproject.databinding.ItemMainRecyclerBinding
import com.ankit.demofarproject.model.MenuModel

class HomeMainMenuAdapter(var context: Context, var mainList: List<MenuModel.MainMenuModel>)
    : RecyclerView.Adapter<HomeMainMenuAdapter.MyViewHolder>() {
    lateinit var binding: ItemMainRecyclerBinding
    lateinit var innerAdapter : InnerRecyclerAdapter
    val innerList = ArrayList<MenuModel.InnerMenuModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflator = LayoutInflater.from(context)
        binding = DataBindingUtil.inflate(inflator, R.layout.item_main_recycler, parent, false)
        return MyViewHolder(binding.root)
    }

    override fun getItemCount(): Int {
        return mainList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(mainList[position])
    }


    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(item : MenuModel.MainMenuModel){
//            createInnerList()
            binding.innerRecycler.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false )
            innerAdapter = InnerRecyclerAdapter(context, item.innerList)
            binding.innerRecycler.adapter = innerAdapter
            binding.title.text = item.title

        }

    }

}