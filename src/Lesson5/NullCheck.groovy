package Lesson5

import groovy.transform.Canonical
import groovy.transform.Final


static void main(String[] args) {
    def p1 = new Pokemon(dono: "Treinador 1", nome: "Piplup", level: 5)

    def p2 = new Pokemon(dono: "Treinador 1", nome: "Piplup", level:  5)

    def p3 = new Pokemon(dono: null, nome: "Piplup", level:  5)



    assert p1 == p2

}

@Canonical
@groovy.transform.NullCheck(includeGenerated = true)
class Pokemon{
    String dono, nome
    Integer level
}

