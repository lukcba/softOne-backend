package com.softone.person


import grails.rest.*
import grails.converters.*

class StudyLevelsController extends RestfulController {
	static responseFormats = ['json', 'xml']

    StudyLevelsController(){
        super(StudyLevel)
    }
	
    def index() { }
}
