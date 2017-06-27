package com.softone.person

import grails.rest.Resource

@Resource(uri='/operators',superClass = OperatorController)
class Operator {

    String name
    boolean enabled = true

    static mapping = {
        id generator: 'native', params: [sequence: 'seq_operator'], defaultValue: "nextval('seq_operator')"
        sort name: 'asc'
    }

    static constraints = {
        name nullable:false, blank:false, unique: true
    }
}
