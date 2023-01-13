package com.wbj.stockalarm.data.transfer_object

open class Stock {
    var mCode:Int = 0
    var mName:String = "UnKnown"

    constructor(code:Int){
        mCode = code!!
    }
}