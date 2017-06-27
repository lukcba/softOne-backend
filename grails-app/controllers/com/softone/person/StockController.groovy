package com.softone.person

import grails.rest.RestfulController

class StockController extends RestfulController {
    static responseFormats = ['json', 'xml']

    StockController(){
        super(Stock)
    }

    def index() { }
}
