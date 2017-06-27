package com.softone.person

import grails.rest.Resource

@Resource(uri='/buys',superClass = BuysController)
class Buy {

    Provider provider
    Date createdAt
    Double amount

    static constraints = {
    }

    static hasMany = [stocks:Stock]

    static mapping = {
        id generator: 'native', params: [sequence: 'seq_buy'], defaultValue: "nextval('seq_buy')"
        sort name: 'asc'
    }
}
