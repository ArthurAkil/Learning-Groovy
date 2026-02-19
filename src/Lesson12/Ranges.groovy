package Lesson12

import org.w3c.dom.ranges.Range

static void main(String[] args) {

    def letters = ['a', 'b', 'c', 'd']

    // for padrão em java
    for (int i = 0; i < letters.size(); i++){
        println(letters.get(i)) //sout
    }

    // for em groovy
    IntRange r = 1..10
    println(r.toList())
    println(r.from)
    println(r.to)

    for (i in r) {
        println(i)
    }

    def r1 = 1..<10
    println(r1)
    println(r1.toList())

    assert (0..10).contains(0)
    assert (0..10).contains(10)
    assert (0..10).contains(-1) == false
    assert (-10..0).contains(-1)

    Date today = new Date()
    Date proxSemana = today + 7
    println(today)
    println(proxSemana)

    def dias = today..proxSemana // vai guardar os dias do dia de hoje até o da próxima semana
    println(dias.toList()) // listando a variavel(Type: Date) de dias

    def letras = "a".."z" // armazenar todas as letras de A a Z
    println(letras.toList()) // listando as strings dentro de letras

}