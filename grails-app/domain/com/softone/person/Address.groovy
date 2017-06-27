package com.softone.person

import grails.rest.Resource
import person.AddressType


@Resource(uri='/addresses',superClass = AddressesController)
class Address {

    String street
    Integer namber
    Integer floor
    String department
    String province
    String country
    String districts
    AddressType type

    static constraints = {
    }

    static mapping = {
        id generator: 'native', params: [sequence: 'seq_address'], defaultValue: "nextval('seq_address')"
    }
}
