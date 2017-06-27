package com.softone.person

import grails.rest.RestfulController

class AddressesController extends RestfulController{
    AddressesController(){
        super(Address)
    }

	static responseFormats = ['json', 'xml']
	
    def index() { }
}
