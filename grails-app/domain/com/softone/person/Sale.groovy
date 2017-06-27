package com.softone.person

import grails.rest.Resource

@Resource(uri='/sales',superClass = SaleController)
class Sale {
    Provider provider
    Date createdAt
    Double amount

    static constraints = {
    }

    static mapping = {
        id generator: 'native', params: [sequence: 'seq_sale'], defaultValue: "nextval('seq_sale')"
    }

    static hasMany = [stocks:Stock]
}
