package com.softone.person

import grails.rest.RestfulController

class ProductController extends RestfulController{
    ProductController(){
        super(Product)
    }
	static responseFormats = ['json', 'xml']
	
}
