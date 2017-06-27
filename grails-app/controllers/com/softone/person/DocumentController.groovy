package com.softone.person

import grails.rest.RestfulController

class DocumentController extends RestfulController{
    static responseFormats = ['json', 'xml']

    DocumentController(){
        super(Document)
    }

    def index() { }
}
