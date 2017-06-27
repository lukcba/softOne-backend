package com.softone.person

import grails.rest.RestfulController

class ProductsController extends RestfulController{
    ProductsController(){
        super(Product)
    }
	static responseFormats = ['json', 'xml']
	
    def index() { }
}
