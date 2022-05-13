package com.example.firstapp.ui.home


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.firstapp.R
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.item_view_liner_vertical.view.*


class HomeFragment : Fragment(R.layout.fragment_home) {

    // 1.重写这个函数
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // 重写三个函数
        super.onViewCreated(view, savedInstanceState)

//        // (1) 垂直滑动布局
//        recycler_view.layoutManager =
//            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
//        // (2)水平滑动布局
//        recycler_view.layoutManager =
//            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
//        // (3)网格滑动布局
//        recycler_view.layoutManager =
//            GridLayoutManager(context, 2)
        // (4)瀑布流布局
        recycler_view.layoutManager =
            StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)



        recycler_view.adapter = MyAdapter()
    }

    inner class MyAdapter : RecyclerView.Adapter<MyViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

//            // (1)垂直列表：绑定item_view_liner_vertical页面
//            val itemView = LayoutInflater.from(context)
//                .inflate(R.layout.item_view_liner_vertical, parent, false)
//            return  MyViewHolder(itemView)
//            // (2)水平列表：绑定item_view_liner_horizontal页面
//            val itemView = LayoutInflater.from(context)
//                .inflate(R.layout.item_view_liner_horizontal, parent, false)
//            return  MyViewHolder(itemView)
            // (3)网格列表：绑定item_view_grid页面 (4)瀑布流也是用这个
            val itemView = LayoutInflater.from(context)
                .inflate(R.layout.item_view_grid, parent, false)
            return  MyViewHolder(itemView)


        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            holder.itemView.item_image.setImageResource(R.drawable.ks)

            // (4)瀑布流新添
            if(position==0||position==3||position==4||position==7||position==9){
                holder.itemView.item_message.setSingleLine(false)
            }else{
                holder.itemView.item_message.setSingleLine(true)
            }

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