package com.softone.person

import grails.rest.RestfulController

class SocialAssistanceController extends RestfulController{

    SocialAssistanceController(){
        super(SocialAssistance)
    }

    static responseFormats = ['json', 'xml']
	
    def index() { }
}
