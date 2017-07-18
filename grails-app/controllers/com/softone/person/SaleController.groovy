package com.softone.person

import grails.rest.RestfulController

class SaleController extends RestfulController {
    static responseFormats = ['json', 'xml']

    SaleController(){
        super(Sale)
    }

}
