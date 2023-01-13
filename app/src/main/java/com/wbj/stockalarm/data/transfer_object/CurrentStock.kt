package com.wbj.stockalarm.data.transfer_object

class CurrentStock(code: Int) : Stock(code){
    var mCurrentPrize = 0
}