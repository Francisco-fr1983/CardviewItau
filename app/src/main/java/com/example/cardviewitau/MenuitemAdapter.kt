package com.example.cardviewitau

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuitemAdapter() : RecyclerView.Adapter<MenuitemAdapter.MenuitemAdapterViewHolder>() {

    private val list = mutableListOf<MenuitemModel>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuitemAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false)
        return MenuitemAdapterViewHolder(view)
    }
    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MenuitemAdapterViewHolder, position: Int) {
        holder.iniciaView(list[position])

    }

    fun setItensList(lista: List<MenuitemModel>)  {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()


    }

    class MenuitemAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvTitle by lazy {
            itemView.findViewById<TextView>(R.id.rv_list)
        }

        fun iniciaView(item: MenuitemModel) {
            tvTitle.text = item.titulo

        }
    }
}