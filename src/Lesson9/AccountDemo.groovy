package Lesson9

import groovy.transform.ToString

static void main(String[] args) {

    Conta checking = new Conta(nome: "Checking")
    checking.deposito(100.0)
    Conta savings = new Conta(nome: "Savings")
    savings.deposito(50.0)

    println(checking)
    println(savings)

    // metodo plus que é traduzido pelo groovy como +
    Conta totalContas = checking + savings

    println(totalContas)

    println(totalContas.balance)

}
@ToString
class Conta{
    String nome
    BigDecimal balance = 0

    void deposito(BigDecimal x){
        balance += x
    }

    BigDecimal retirada(BigDecimal x){
        if (x > this.balance)
            return 0
        this.balance - x
    }

    Conta plus(Conta outraConta){
        new Conta(nome: "${this.nome} + ${outraConta.nome}", balance: this.balance + outraConta.balance)
    }
}
