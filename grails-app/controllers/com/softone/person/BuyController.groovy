package com.softone.person

import grails.rest.RestfulController

class BuyController extends RestfulController{
    static responseFormats = ['json', 'xml']

    BuyController(){
        super(Buy)
    }

}
