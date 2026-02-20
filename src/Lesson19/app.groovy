package Lesson19

import Lesson19.services.PersonService

PersonService personService = new PersonService()

println(personService.find())
println(personService.findAll())
