package com.wbj.stockalarm.data.transfer_object

open class CustomPrice(code: Int): CurrentStock(code) {
    var mFirstStartPrice:Int = 0
    var mFirstEndPrice:Int = 0
    var mSecondStartPrice:Int = 0
    var mSecondEndPrice:Int = 0
    var mLastPurchasePrice:Int = 0

    var mFirstCellPrice:Int = 0
    var mSecondCellPrice:Int = 0
    var mLastCellePrice:Int = 0
}