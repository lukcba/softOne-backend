package com.softone.person

import grails.rest.Resource

@Resource(uri='/stocks',superClass = StockController)
class Stock {

    static constraints = {
    }
    static mapping = {
        id generator: 'native', params: [sequence: 'seq_stock'], defaultValue: "nextval('seq_stock')"
    }
}
