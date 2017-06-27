package com.softone.person

import grails.rest.Resource
import person.AddressType


@Resource(uri='/addresses',superClass = AddressController)
class Address {

    String street
    Integer namber
    Integer floor
    String department
    String province
    String country
    String districts
    AddressType type

    static mapping = {
        id generator: 'native', params: [sequence: 'seq_address'], defaultValue: "nextval('seq_address')"
    }

    static constraints = {
        street nullable:false, blank:false, unique: true
    }
}
