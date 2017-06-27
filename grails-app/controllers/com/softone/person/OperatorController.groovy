package com.softone.person

import grails.rest.RestfulController

class OperatorController extends RestfulController{
	static responseFormats = ['json', 'xml']

    OperatorController(){
        super(Operator)
    }
	
    def index() { }
}
