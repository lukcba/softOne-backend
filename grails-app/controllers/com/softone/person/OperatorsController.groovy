package com.softone.person

import grails.rest.RestfulController

class OperatorsController extends RestfulController{
	static responseFormats = ['json', 'xml']

    OperatorsController(){
        super(Operator)
    }
	
    def index() { }
}
