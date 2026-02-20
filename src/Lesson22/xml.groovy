package Lesson22

import groovy.xml.MarkupBuilder

MarkupBuilder mkbuilder = new MarkupBuilder()

// na duvida da aplicação ver os testes que o groovy fornece em seu github

mkbuilder.omitEmptyAttributes = true
mkbuilder.omitNullAttributes = true

mkbuilder.sports {
    sport(id:1) {
        name 'Baseball'
    }
    sport(id:2) {
        name 'Basketball'
    }
    sport(id:3) {
        name 'Football'
    }
    sport(id:4) {
        name 'Hockey'
    }
    sport(id:null) {
        name ''
    }

}