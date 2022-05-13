package com.example.firstapp.ui.home


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.firstapp.R
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.item_view_liner_vertical.view.*


class HomeFragment : Fragment(R.layout.fragment_home) {

    // 1.重写这个函数
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recycler_view.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        recycler_view.adapter = MyAdapter()
    }

    inner class MyAdapter : RecyclerView.Adapter<MyViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val itemView = LayoutInflater.from(context)
                .inflate(R.layout.item_view_liner_vertical, parent, false)
            return  MyViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            holder.itemView.item_image.setImageResource(R.drawable.ks)

            holder.itemView.item_title.text = "[${position}] 快手App"
            holder.itemView.item_message.text = "快手是一款国民级短视频App。在快手,了解真实的世界,认识有趣的人,也可以记录真实而有趣的自己。"
        }

        override fun getItemCount(): Int {
            return 20
        }
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view){

    }

}