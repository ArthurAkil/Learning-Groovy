package Lesson19.services

import Lesson19.domain.Person

class PersonService implements IPersonService {

    @Override
    Person find() {
        Person p = new Person(nome: "tutu", snome: "tete")
        return p
    }

    @Override
    List<Person> findAll() {
        Person p1 = new Person(nome: "tutu", snome: "tete")
        Person p2 = new Person(nome: "toto", snome: "titi")
        return [p1,p2]
    }
}
