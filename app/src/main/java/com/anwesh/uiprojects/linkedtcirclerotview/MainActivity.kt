package com.anwesh.uiprojects.linkedtcirclerotview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.tcirclerotview.TCircleRotView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TCircleRotView.create(this)
    }
}
