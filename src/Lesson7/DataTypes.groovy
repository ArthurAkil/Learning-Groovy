package Lesson7

static void main(String[] args) {
    // Data Types

    // Primitive Types
    // Java
    /*
    byte, short, int, long, float, double, char, boolean
    */

    // groovy (interpreta tudo do como objeto, então podemos ver que podemos ver a classe de cada numero, e vimos que o groovy interpreta direto o tipo que o objeto recebe)
    // integer, biginteger, decimal, bigdecimal, boolean
    // a existancia do def é que podemos declarar variavel sem um tipo determinado, ou seja, guarda isso dependendo do valor
    def b = 123
    b = "ola"

    Integer c = 123
    // c = "ola" // error
    println(b.getClass().name)
    println(c.getClass().name)
}