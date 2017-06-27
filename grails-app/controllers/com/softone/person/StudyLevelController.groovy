package com.softone.person

import grails.rest.RestfulController

class StudyLevelController extends RestfulController {
	static responseFormats = ['json', 'xml']

    StudyLevelController(){
        super(StudyLevel)
    }
	
    def index() { }
}
