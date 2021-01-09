package com.example.foodie

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import asd.TeamilkSum
import kotlinx.android.synthetic.main.layout5.*

class shopms : AppCompatActivity() {
    val shop=TeamilkSum()
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout5)
        //页面跳转
        subm1.setOnClickListener {
            val myIntent= Intent()
            myIntent.setClass(
                applicationContext,
                main::class.java
            )
            startActivity(myIntent)
        }

        displ1.text="原味烤奶"+shop.order.tea1Price+"元1杯\n乌龙奶茶"+shop.order.tea2Price+"元1杯\n焦糖可可"+shop.order.tea3Price+"元1杯\n烘培牛乳"+shop.order.tea4Price+"元1杯\n"
        tt1.text = shop.order.tea1Count.toString()
        tt2.text = shop.order.tea1Count.toString()
        tt3.text = shop.order.tea1Count.toString()
        tt4.text = shop.order.tea1Count.toString()
        val listener = ButtonListener()
        t1f.setOnClickListener(listener)
        t1j.setOnClickListener(listener)
        t2f.setOnClickListener(listener)
        t2j.setOnClickListener(listener)
        t3f.setOnClickListener(listener)
        t4j.setOnClickListener(listener)
        t5f.setOnClickListener(listener)
        t5j.setOnClickListener(listener)
        rede1.setOnClickListener(listener)
    }
    //按钮的效应，点击按钮然后进行相应的操作
    inner class ButtonListener: View.OnClickListener{

        override fun onClick(v: View) {
            when(v.id){
                R.id.t1j -> {
                    shop.addt1()
                    tt1.text = shop.order.tea1Count.toString()
                }
                R.id.t1f -> {
                    shop.subt1()
                    tt1.text = shop.order.tea1Count.toString()
                }

                R.id.t2j -> {
                    shop.addt2()
                    tt2.text = shop.order.tea2Count.toString()
                }
                R.id.t2f -> {
                    shop.subt2()
                    tt2.text = shop.order.tea2Count.toString()
                }

                R.id.t4j -> {
                    shop.addt3()
                    tt3.text = shop.order.tea3Count.toString()
                }
                R.id.t3f -> {
                    shop.subt3()
                    tt3.text = shop.order.tea3Count.toString()
                }

                R.id.t5j -> {
                    shop.addt4()
                    tt4.text = shop.order.tea4Count.toString()
                }
                R.id.t5f -> {
                    shop.subt4()
                    tt4.text = shop.order.tea4Count.toString()
                }
                //点击确认之后，在下面的文本框中显示一共的点单数目和点单的价钱
                R.id.rede1 -> {
                    val result = shop.makeOrder()
                    displ1.text = result
                }
            }
        }
    }
}