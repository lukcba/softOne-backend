package com.softone.person

import grails.rest.RestfulController

class PersonsController extends RestfulController{
    PersonsController(){
        super(Person)
    }
	static responseFormats = ['json', 'xml']
	
    def index() { }
}
