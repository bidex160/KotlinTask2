package com.example.kotlintask2

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class itemclass(
    val name:String,
    val imgurl:Int,
    val price:String,
    val desc:String
) : Parcelable