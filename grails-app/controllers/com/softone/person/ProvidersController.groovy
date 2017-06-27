package com.softone.person

import grails.rest.RestfulController

class ProvidersController extends RestfulController{
    static responseFormats = ['json', 'xml']
    ProvidersController(){
        super(Provider)
    }

    def index() { }
}
