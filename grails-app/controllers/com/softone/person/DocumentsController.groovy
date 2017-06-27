package com.softone.person


import grails.rest.*
import grails.converters.*

class DocumentsController extends RestfulController{
    DocumentsController(){
        super(Document)
    }
	static responseFormats = ['json', 'xml']
	
    def index() { }
}
