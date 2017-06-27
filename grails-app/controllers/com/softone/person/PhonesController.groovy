package com.softone.person

import grails.rest.RestfulController

class PhonesController extends RestfulController {
    PhonesController(){
        super(Phone)
    }
	static responseFormats = ['json', 'xml']
	
    def index() { }
}
