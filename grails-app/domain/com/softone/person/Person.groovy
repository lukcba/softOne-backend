package com.softone.person

import grails.rest.Resource
import person.Gender
import person.IdentityType
import person.MaritalStatus

@Resource(uri='/persons',superClass = PersonsController)
class Person {

    String name
    String lastName
    Date birthDate
    Gender gender
    MaritalStatus maritalStatus
    IdentityType identityType
    String numberIdentityType
    Date createdAt
    String nationality
    Date created
    String email

    static hasMany = [addresses: Address, phones: Phone]


    static constraints = {
        name nullable: false
        email email: true, blank: false
    }

    static mapping = {
        id generator: 'native', params: [sequence: 'seq_person'], defaultValue: "nextval('seq_person')"
        sort name: 'asc'
    }

}