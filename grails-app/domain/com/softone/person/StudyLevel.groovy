package com.softone.person

import grails.rest.Resource

@Resource(uri='/studyLevels')
class StudyLevel {

    String name
    boolean enabled = true

    static mapping = {
        id generator: 'native', params: [sequence: 'seq_study_level'], defaultValue: "nextval('seq_study_level')"
        sort name: 'asc'
    }

    static constraints = {
        name nullable:false, blank:false, unique: true
    }
}
