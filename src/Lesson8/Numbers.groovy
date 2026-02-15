package Lesson8

static void main(String[] args) {
    // Groovy Number defaults

    def number = 10
    println(number.class)

    def decimal = 5.50
    println(decimal.class)

    //Converting data types

    // Explicit - casting
    def myFloat = (float) 1.0
    println(myFloat.class) // Float - casting feito manualmente

    // Implicit - coercion
    def myDouble = 324234.243242
    // Foi feito a coersão do que seria um double no java para BigDecimal no groovy

    // Rules for + - *

    // Se o operando é do tipo float ou um double, o resultado é um double
    // Em java se apenas tipos floats estiverem presentes em uma operação o resultado também será do tipo float, mas no groovy, sera double independente

    Float f = 5.56
    Double d = 101.60

    def result = f * d
    println("primeiro resultado $result")
    println("classe: $result.class")

    Float a = 10.75
    Float b = 6.25
    def result2 = a / b
    println(result2)
    println(result2.class) // double

    // Se o operando é um bigdecimal
    def x = 34.5
    def y = 13
    def result3 = x / y
    println(result3)
    println(result3.class) // bigDecimal

    // Se o operando for um big integer o resultado será um big integer
    // se o operando for um long o resultado é um long
    // se o operando for um integer o resultado é um integer

    // Operações de double
    println(5.0d - 4.1d) // 0.90000000000000004
    println(5 - 4.1d)

    // Operações com integer
    def intdiv = 1/2
    println(intdiv)
    println(intdiv.class) // big decimal
    println(1.intdiv(2))

    // GDK Method

    assert 2 == 2.5.toInteger()
    assert 2 == 2.5 as Integer
    assert 2 == (int) 2.5

    assert "5.50".isNumber()
    assert 5 == "5".toInteger()


    // Existencia do times (for loop basicamente com contagem certa)
    // O times aceita uma clousure dentro iteravel -> bloco de código
    10.times {it -> if(it % 2 ==0){
        println("$it é par")
    }}

    // aqui não definimos o valor do iteravel, geralmente ele ja coloca como it
    1.upto(10){
        if(it % 2 != 0){
            println("$it é impar")
        }
    }

     // o step por sua vez eu escolho como serão os passos de um numero ate outro
    0.step(1, 0.1){num -> {
        println(num)
    }}
}