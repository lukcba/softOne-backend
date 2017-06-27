package com.softone.person

import grails.rest.RestfulController

class PersonController extends RestfulController{
    static responseFormats = ['json', 'xml']

    PersonController(){
        super(Person)
    }

    def index() { }
}
