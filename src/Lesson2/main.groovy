package Lesson2

static void main(String[] args) {

    Developer d = new Developer();
    d.name = "dan"
    d.lastname = "morial"

    // listas dentro das classes já são criadas automaticamente como ArrayList
    println(d.languages.getClass().getName()) // -> java.util.ArrayList

//    Passar valores para uma lista usamos <<

    d.languages << "Groovy"
    d.languages << "Java"

    d.languages.forEach {
        println(it) // podemos definir it como algo que já vai ser iterado, não precisando nomear
    }

    d.languages.forEach {
        linguas -> println(linguas) // outra forma com lambdas do java
    }


}

class Developer {
    String name, lastname // podemos definir as variaveis assim de forem do mesmo tipo

    def languages = []
}
