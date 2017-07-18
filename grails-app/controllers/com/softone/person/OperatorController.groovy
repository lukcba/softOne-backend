package com.softone.person

import grails.rest.RestfulController
import org.springframework.transaction.annotation.Transactional

@Transactional(readOnly = true)
class OperatorController extends RestfulController{
	static responseFormats = ['json', 'xml']

    OperatorController(){
        super(Operator)
    }
}
