package com.dk.twowaydatabindingwithbindingadapter2

import android.graphics.Color
import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("myProgress")
fun myProgressConfig(view : ImageView, myPointType: PointType) {
    when (myPointType) {
            PointType.VERY_BIG -> {view.setColorFilter(Color.parseColor("#9C27B0"))}
            PointType.BIG -> {view.setColorFilter(Color.parseColor("#AB47BC"))}
            PointType.MIDDLE -> {view.setColorFilter(Color.parseColor("#BA68C8"))}
            PointType.SMALL -> {view.setColorFilter(Color.parseColor("#CE93D8"))}
            PointType.VERY_SMALL -> {view.setColorFilter(Color.parseColor("#E1BEE7"))}
    }

}