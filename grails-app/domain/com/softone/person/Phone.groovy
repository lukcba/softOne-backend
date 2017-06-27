package com.softone.person

import grails.rest.Resource
import person.PhoneType

@Resource(uri='/phones',superClass = PhoneController)
class Phone {

    String number
    String description
    PhoneType type
    Operator operator
    Date createdAt
    Date validThrough
    boolean byDefault = false


    static mapping = {
        id generator: 'native', params: [sequence: 'seq_phone'], defaultValue: "nextval('seq_phone')"
        sort validThrough: 'desc'
    }

    static belongsTo = [person:Person]

    static constraints = {
        number nullable:false, blank:false
        type nullable:false
        operator nullable:false
        validThrough nullable:true
        createdAt nullable:false
        description nullable:true
    }

    def beforeValidate() {
        if(!this.id){
            this.createdAt = new Date()
        }
    }

}
