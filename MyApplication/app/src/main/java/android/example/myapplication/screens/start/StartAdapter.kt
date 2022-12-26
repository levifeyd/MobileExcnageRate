package android.example.myapplication.screens.start

import android.annotation.SuppressLint
import android.example.myapplication.Model.nalichka.NalItem
import android.example.myapplication.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_money_layout.view.*

class StartAdapter : RecyclerView.Adapter<StartAdapter.StartViewHolder>(){

    var listStart = emptyList<NalItem>()
    class StartViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent,false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.itemView.tv_item_name.text = listStart[position].ccy
        holder.itemView.tv_item_buy.text = listStart[position].buy
        holder.itemView.tv_item_sale.text = listStart[position].sale
    }

    override fun getItemCount(): Int {
        return listStart.size

    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<NalItem>) {
        listStart = list
        notifyDataSetChanged()
    }

}