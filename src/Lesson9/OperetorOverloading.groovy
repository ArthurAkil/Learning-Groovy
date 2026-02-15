package Lesson9

static void main(String[] args) {
    def a = 1
    def b = 2

    // quando dois objetos se interagem com outro, é feito o uso de metodos escondidos por de baixo dos panos sejam plus(), minus(), e por ai vai

    println(a + b)
    println(a.plus(b))

    def s1 = "Hello"
    def s2 = ", World"
    println(s1 + s2)
    println(s1.plus(s2))

    Account savings = new Account(balance: 100.00)
    Account checking = new Account(balance: 500.00)

    println(savings + checking) // 1. Error, no signature of method: plus

    println((savings + checking).balance)

}

class Account{
    BigDecimal balance

    // Basicamente fizemos um overloading no metodo plus que agora retorna uma Account nova com o valor da soma das suas propriedades
    Account plus (Account other){
        new Account(balance: this.balance + other.balance)
    }
}