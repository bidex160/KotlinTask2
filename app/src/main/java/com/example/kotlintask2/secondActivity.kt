package com.example.kotlintask2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class secondActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initviews()




    }
    fun initviews(){
        val txtname:TextView = findViewById(R.id.txtname)
       val txtdesc : TextView = findViewById(R.id.txtdesc)
        val txtprice :TextView = findViewById(R.id.txtprice)
        val img : ImageView = findViewById(R.id.imageView2)
        val itemclass = intent.getParcelableExtra<itemclass>(MainActivity.passint)

         txtname.text = itemclass.name
        txtprice.text = itemclass.price
        txtdesc.text = itemclass.desc
        img.setImageResource(itemclass.imgurl)
        Toast.makeText(this, itemclass.desc, Toast.LENGTH_LONG).show()
    }
}
