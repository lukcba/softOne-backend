package com.softone.person

import grails.rest.Resource

@Resource(uri='/socialAssistance',superClass = SocialAssistanceController)
class SocialAssistance {

    static mapping = {
        id generator: 'native', params: [sequence: 'seq_social_assistance'], defaultValue: "nextval('seq_social_assistance')"
    }

    static constraints = {
    }
}
