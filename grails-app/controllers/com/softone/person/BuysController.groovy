package com.softone.person

import grails.rest.RestfulController

class BuysController extends RestfulController{
    BuysController(){
        super(Buy)
    }
	static responseFormats = ['json', 'xml']
	
    def index() { }
}
