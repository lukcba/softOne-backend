package com.softone.person

import grails.rest.RestfulController

class AddressController extends RestfulController{
    static responseFormats = ['json', 'xml']

    AddressController(){
        super(Address)
    }

}
