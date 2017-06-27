package com.softone.person

import grails.rest.RestfulController

class SalesController extends RestfulController {
    SalesController(){
        super(Sale)
    }
	static responseFormats = ['json', 'xml']
	
    def index() { }
}
