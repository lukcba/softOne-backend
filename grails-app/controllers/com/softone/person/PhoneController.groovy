package com.softone.person

import grails.rest.RestfulController

class PhoneController extends RestfulController {
    static responseFormats = ['json', 'xml']

    PhoneController(){
        super(Phone)
    }

}
