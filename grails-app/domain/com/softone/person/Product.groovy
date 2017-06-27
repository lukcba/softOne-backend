package com.softone.person

import grails.rest.Resource

@Resource(uri='/products',superClass = ProductsController)
class Product {

    static mapping = {
        id generator: 'native', params: [sequence: 'seq_product'], defaultValue: "nextval('seq_product')"
    }

    static constraints = {
    }
}
