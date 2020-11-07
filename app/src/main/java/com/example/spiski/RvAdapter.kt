package com.example.spiski

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item.view.*

class RvAdapter(val actorsList : MutableList<Actor> ): RecyclerView.Adapter<RvAdapter.RvView>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvView {
      return RvView(LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false))
    }

    override fun onBindViewHolder(holder: RvView, position: Int) {
       val actor = actorsList[position]
        val fio = holder.itemView.findViewById<TextView>(R.id.fio)
        fio.text = actor.name

        if (actorsList[position].oskar) holder.itemView.oscarVis.visibility = View.VISIBLE

        Glide.with(holder.itemView)
            .load(actor.avatar)
            .into(holder.itemView.avatar)

    }
    override fun getItemCount(): Int {
     return actorsList.size
    }


    fun addActor(index: Int ,actor: Actor){
        actorsList.add(index,actor)
        notifyDataSetChanged()
    }

    class RvView(view: View):RecyclerView.ViewHolder(view)
}
