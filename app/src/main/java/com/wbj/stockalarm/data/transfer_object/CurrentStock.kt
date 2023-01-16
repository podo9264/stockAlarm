package com.wbj.stockalarm.data.transfer_object

open class CurrentStock(code: Int) : Stock(code){
    var mCurrentPrize:Int = 0
}