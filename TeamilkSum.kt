package asd
import java.lang.StringBuilder
/*
生成订单的方法，数量加减的方法
总数等于单价乘以杯数

 */
class TeamilkSum {
    val order=TeamilkOr()
    fun makeOrder(): String {
        val builder = StringBuilder()
        if(order.tea1Count!=0){
            builder.append("加购了" + order.tea1Count + "杯原味烤奶\n")
        }
        if(order.tea2Count!=0){
            builder.append("加购了" + order.tea2Count + "杯乌龙奶茶\n")

        }
        if(order.tea3Count!=0){
            builder.append("加购了" + order.tea3Count + "杯焦糖可可\n")

        }
        if(order.tea4Count!=0){
            builder.append("加购了" + order.tea4Count + "杯烘培牛乳\n")
        }



        val totalPrice = order.tea1Count * order.tea1Price + order.tea2Count * order.tea2Price+order.tea3Count * order.tea3Price+order.tea4Count * order.tea4Price
        builder.append("共计：" + totalPrice + "元")
        return builder.toString()
    }
    fun addt1() {
        if (order.tea1Count < 10) {
            order.tea1Count = order.tea1Count + 1
        }
    }

    fun subt1() {
        if (order.tea1Count > 0) {
            order.tea1Count = order.tea1Count - 1
        }
    }

    fun addt2() {
        if (order.tea2Count < 10) {
            order.tea2Count = order.tea2Count + 1
        }
    }

    fun subt2() {
        if (order.tea2Count > 0) {
            order.tea2Count = order.tea2Count - 1
        }
    }

    fun addt3() {
        if (order.tea3Count < 10) {
            order.tea3Count = order.tea3Count + 1
        }
    }

    fun subt3() {
        if (order.tea3Count > 0) {
            order.tea3Count = order.tea3Count - 1
        }
    }

    fun addt4() {
        if (order.tea4Count < 10) {
            order.tea4Count = order.tea4Count + 1
        }
    }

    fun subt4() {
        if (order.tea4Count > 0) {
            order.tea4Count = order.tea4Count - 1
        }
    }
}