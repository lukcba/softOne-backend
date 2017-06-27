package com.softone.person

import grails.rest.Resource

@Resource(uri='/providers',superClass = ProviderController)
class Provider {
    String businessName
    Date registrationDate
    String email
    String web
    Date createdAt

    static constraints = {
        businessName nullable: false
    }

    static hasMany = [addresses:Address, phones:Phone]

    static mapping = {
        id generator: 'native', params: [sequence: 'seq_provider'], defaultValue: "nextval('seq_provider')"
    }

    def beforeValidate() {
        if(!this.id){
            this.createdAt = new Date()
        }
    }
}
