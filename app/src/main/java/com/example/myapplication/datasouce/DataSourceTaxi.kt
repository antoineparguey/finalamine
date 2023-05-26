package com.example.myapplication.datasouce

import com.example.myapplication.R
import com.example.myapplication.datamodel.taxi


class DataSourceTaxi {
    val listetaxi = listOf<taxi>(
        taxi(R.string.taxi1),
        taxi(R.string.taxi2),
        taxi(R.string.taxi3),
        taxi(R.string.taxi4),
        taxi(R.string.taxi5),
        taxi(R.string.taxi6),
        taxi(R.string.taxi7),
        taxi(R.string.taxi8)
    )
    fun loadAffirmations(): List<taxi> {
        return listetaxi
    }

}