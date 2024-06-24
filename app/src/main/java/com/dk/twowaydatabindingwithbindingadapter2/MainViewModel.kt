package com.dk.twowaydatabindingwithbindingadapter2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _point = MutableLiveData(0)
    val point : LiveData<Int> = _point

    //포인트에 따라 포인트 타입이 바뀐다.
    val myPointType : LiveData<PointType> = Transformations.map(_point) {

        when {
            it > 80 -> {PointType.VERY_BIG}
            it > 60 -> {PointType.BIG}
            it > 40 -> {PointType.MIDDLE}
            it > 20 -> {PointType.SMALL}
            else -> {PointType.VERY_SMALL}
        }
    }

    fun pointPlus(){
        _point.value = _point.value?.plus(10)
    }

}

// 4가지 상태에 따라서 색깔 변화 -> BIG / MIDDLE / SMALL / VERY_SMALL
enum class PointType {
    VERY_BIG,
    BIG,
    MIDDLE,
    SMALL,
    VERY_SMALL
}