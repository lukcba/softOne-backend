package com.softone.person

import grails.rest.Resource

@Resource(uri='/documents',superClass = DocumentsController)
class Document {

    String name
    String path
    String originalFileName
    Date createdAt

    static mapping = {
        id generator: 'native', params: [sequence: 'seq_document'], defaultValue: "nextval('seq_document')"
    }

    static constraints = {
        name nullable:false, blank:false
    }

    def beforeValidate() {
        if(!this.id){
            this.createdAt = new Date()
        }
    }

}
