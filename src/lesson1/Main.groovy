package lesson1

import groovy.transform.ToString

static void main(String[] args) {

    def p1 = new Person(name: "Laura", age: 20)

    Person p2 = new Person()

    p2.name = "Euzinho" //acessamos o set (o groovy faz isso internamente)
    p2.age = 29; //acessamos o set (o groovy faz isso internamente)

    println(p2.name) // estamos acessando o get (groovy faz internamente)

    p1.printAttributes()

    println("p1: $p1")

    def x = 5;

    assert x == 5; // true, assertes -> testes

    def a = "sadas";

    println(a.getClass())



/*    um arquivo que contem mais de uma classe
        a ideia é a seguinte, quando temos um arquivo que possui + de uma classe, exemplo:
            1. Temos a classe Pessoa.groovy criada na lesson 1, dentro dela foi criada mais 2 classes (class Humano, class Grilo)
            2. No groovy elas são criadas de forma diferentes, percebemos pela setinhas, o que eu acredito: Por causa disso vem a ideia de criarmos um arquivo de classe que pode conter todas as classes que envolvem ela, exemplo: uma abstrata e todas as suas filhas, assim sendo uma organização melhor

    O Groovy permite que você defina múltiplas classes em um único arquivo .groovy. Comum para:

    1. Classes auxiliares: Pequenas classes que só fazem sentido dentro daquele contexto.
    2. Organização lógica: Agrupar uma interface/classe abstrata e suas implementações simples no mesmo lugar, evitando a criação de 5 ou 6 arquivos minúsculos.

    Obs: Dica: Se a classe Grilo começar a ter 100 linhas de código, é hora de dar a ela um arquivo próprio.
    Se ela for apenas um modelo simples com 3 atributos, pode deixar junto com a Pessoa sem medo!
*/
//    mas se um arquivo não possuir classes dentro dele, é considerado um script


}

@ToString()
class Person{
    //Todas as propriedades/atributos são private por default
    String name
    int age

    //Todos os metodos e classes por default são públicos
    public def printAttributes(){
        println("Meu nome é $name e eu tenho $age anos de idade")
    }
}

// coment singular
/*
Coments plural
*/

