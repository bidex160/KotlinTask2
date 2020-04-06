package com.example.kotlintask2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList
import com.example.kotlintask2.RecycleAdapterclass as recycleadpater1


class MainActivity : AppCompatActivity() , recycleadpater1.passdata{
    companion object{
        val passint ="OBJECT_INTENT"
    }

    override fun getdata(x: Int) {

       val Toast = Toast.makeText(applicationContext, "xfffffffffffffffff", Toast.LENGTH_LONG)
        Toast.show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val itemlist = initialize()


      val recycler = findViewById<RecyclerView>(R.id.recycle)
         recycler.adapter = recycleadpater1(this, itemlist){
             val intent = Intent(this,secondActivity::class.java)
             intent.putExtra(passint, it)
             startActivity(intent)

         }
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.setHasFixedSize(true)




    }
    private fun initialize():List<itemclass>{
        val list = ArrayList<itemclass>()
        list.add(itemclass("Laura Mercier Tinted Moisturizer",R.drawable.img1, "$200","It gives you that perfect, sheer, no-makeup makeup look with a little bit of added glow."))
        list.add(itemclass("Anastasia Beverly Hills Jackie Aina Palette",R.drawable.img2, "#300","Beauty influencer, Jackie Aina, collabed with Anastasia Beverly Hills to create a palette with insane color payoff that’s also easy to build on."))
        list.add(itemclass("MAC Studio Fix Soft Matte Foundation Stick",R.drawable.img3, "$200","The formula is really blendable and it leaves behind a matte finish that won’t dry your skin out or settle into your fine lines."))
        list.add(itemclass("Benefit Cosmetics Brow Styler",R.drawable.img4, "$700","It’s a two-in-one eyebrow pencil and powder that shapes and fills your brows."))
        list.add(itemclass("Tarte Double Duty Beauty Busy Gal Gloss",R.drawable.img5, "$200","And this lip gloss from Tarte is one of the best I’ve tried all year. It doesn’t even feel like you’re wearing lip gloss—I know, seems"))
        list.add(itemclass("Best Beauty Products: This Liquid Foundation",R.drawable.img6, "$300","It gives you full coverage with a natural finish that doesn't cake."))
        list.add(itemclass("Clove and Hallow FlexLash Mascara",R.drawable.img7, "$500","The thin formula locks your hairs in place without weighing them down"))


        return list
    }
}
