package Lesson5

import groovy.transform.Immutable

static void main(String[] args) {

    // AST Transformation (Transformação na Árvore Sintática Abstrata)

    def d = new Date()
    def c1 = new Customer(first: "Tom", last: "Jones", age: 21, since: d, favItems: ["Book", "Laptop"])
    def c2 = new Customer('Tom', 'Jones', 21, d, ['Book', 'Laptop'])

    assert c1 == c2 //true - CONTUDO, o normal seria false

    // Por quê? Quando definimos uma classe como Immutable, e verificamos se ela é igual a outra do mesmo tipo, ela implementa automaticamente equals, hashCode e toString, ou seja, ele acaba não comparando o endereço de memória e sim o valor contido em cada atributo/propriedade

    //Como usamos o Immutable estamos criando uma classe com atributos/propriedades final, que após serem definidos em determinada classe não pode haver a alteração posterior
    // Pois por trás no Groovy, acontecendo que ao criarmos a classe e assinar ela como Immutable, ele só cria get para ela
    c1.first = "Dan" // erro
}

@Immutable
class Customer{
    String first, last
    int age
    Date since
    Collection favItems

    // Quando assinamos com o Immutable o groovy cria logo construtores inteligentes, tanto com mapas first: ou posicional(primeiro nome, segundo, etc) na ordem
}