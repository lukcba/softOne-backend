package com.softone.person

import grails.rest.RestfulController

class ProviderController extends RestfulController{
    static responseFormats = ['json', 'xml']

    ProviderController(){
        super(Provider)
    }

    def index() { }
}
