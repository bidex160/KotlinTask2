package com.example.kotlintask2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class RecycleAdapterclass(val contex:Context,val listitem:List<itemclass>, val listener:(itemclass)->Unit):RecyclerView.Adapter<RecycleAdapterclass.Viewholder>() {


    interface passdata{
        fun getdata(x :Int)
    }


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Viewholder {

        val vie  = LayoutInflater.from(p0.context).inflate(R.layout.recyle_adapter_layout, p0, false)

        return Viewholder(vie)

    }

    override fun getItemCount() = listitem.size

    override fun onBindViewHolder(p0: Viewholder, p1: Int) {


       p0.bind(listitem[p1],  listener)

    }

    class Viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
       val name : TextView = itemView.findViewById(R.id.name)
       val img:ImageView = itemView.findViewById(R.id.img)
        val cardview:CardView = itemView.findViewById(R.id.card)


      fun bind (itemclass: itemclass, listener: (itemclass) -> Unit){
          name.text = itemclass.name
          img.setImageResource(itemclass.imgurl)
           cardview.setOnClickListener(View.OnClickListener {
               listener(itemclass)


           // Toast.makeText(itemView.context,itemclass.name, Toast.LENGTH_LONG).show()
        })


      }

   }
}