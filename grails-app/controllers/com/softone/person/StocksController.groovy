package com.softone.person

import grails.rest.RestfulController

class StocksController extends RestfulController {
    StocksController(){
        super(Stock)
    }
	static responseFormats = ['json', 'xml']
	
    def index() { }
}
