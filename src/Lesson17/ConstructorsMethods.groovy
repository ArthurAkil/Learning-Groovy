package Lesson17

import groovy.transform.ToString

static void main(String[] args) {

    // construtor name parameters
    Pessoa p = new Pessoa(nome: "Arthur", snome: "Alves")


}

@ToString //metodo que implementa ToString (sem precisar criar)
class Pessoa {
    String nome, snome

    // constructor - Não precisamos criar explicitamente pois o groovy já faz isso automaticamente

    // construtor personalizado
    Pessoa(String fullName){
        List partes = fullName.split(" ")
        nome = partes[0]
        snome = partes[1]
    }

    // metodos - public por default
    void foo(String a, String b){
        //faça algo
    }

    // o retorno pode ser feito falando o type antes
    String getFullName(){
        "${nome} ${snome}"
    }

    //podemos fazer um metodo com tipo definido para retornar
    def bar(){
        // retorno o que eu quiser que não da problema
    }

    //static metodos - posso ser chamado sem a classe ser instanciada ainda
    static void doGoodWork(){
        println("fazendo um bom trabalho")
    }

    // BOA PRÁTICA - SE VOCÊ SABE O TIPO QUE SERÁ TRATADO DENTRO DO METODO OU PROPRIEDADE, COLOQUE O TYPE

    static boolean ehPessoa(Object o = false){
        if (o instanceof Boolean){
            true
        }
        false
    }

}