package Lesson19.services

import Lesson19.domain.Person

// para interfaces o padrão de nomenclatura é I + Nome
interface IPersonService {

    Person find()

    List<Person> findAll()
}