package com.softone.person

import grails.rest.RestfulController

class SocialAssistanceController extends RestfulController{
    static responseFormats = ['json', 'xml']

    SocialAssistanceController(){
        super(SocialAssistance)
    }

}
