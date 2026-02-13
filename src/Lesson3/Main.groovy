package Lesson3

static void main(String[] args) {

//    No groovy nós temos dois tipos de arquivos:
//    1. Os scripts (rodam as classes criadas)
//    2. As classes (arquivos que possuem as classes criadas pelo desenvolvedor)

//    Exemplo: se eu tentar criar uma classe aqui agora ela vai ser alocada FORA do main, pois ele é um SCRIPT e por tanto não cria classe mas apenas inicializa e faz as coisas com ela

//    class Pokemon {
//        String nome
//        int level
//    }

    // deu erro /\


    /*
        No Java ou no Groovy, você não pode definir uma classe dentro de um metodo (a menos que seja uma Anonymous Inner Class)

        O compilador faz o seguinte:

            1. Cria uma classe invisível que estende groovy.lang.Script.
            2. Pega tdo o seu codigo solto e joga dentro de um metodo chamado run().

        OBS.: O código funcionaria mesmo sem o static main -> o Groovy pega tdo o codigo que não está dentro de uma classe e coloca dentro de um metodo invisivel chamando run(), então n é obrigatório colocarmos. CONTUDO -> se criarmos o metodo static main, estamos dizendo ao groovy, não rode o run, rode o meu código primeiro que está aqui dentro, meu ponto de entrada oficial

        O Lado Script: Onde você instancia objetos, faz cálculos e usa o println.
        O Lado Definição: Onde você define as "plantas" (classes) que o script vai usar.

        Imagine que um arquivo Groovy é uma caixa.

            1. Dentro da caixa, existem Plantas (Classes) e Ações (Código solto).
            2. Um Metodo (como o main) é uma gaveta dentro dessa caixa.
            3. Você tentou guardar uma Planta (Class Pokemon) dentro da gaveta (Metodo Main).

        A regra é: Plantas ficam na caixa, não dentro de gavetas de ação.

    */

    // Como foi criada a classe em "outro" arquivo (entende-se por outro arquivo pois dentro de Lesson3/Main.groovy nós temos uma lista também de uma classe que é justamente o Pokemon

    // Com isso entendemos que é subdividido assim como o código de groovy é lido e interpretado

    Pokemon p1 = new Pokemon(nome: "Charmander", level: 5);
    // E agora no arquivo de script nós criamos e instanciamos a classe
}

    class Pokemon {
        String nome
        int level
    }
    // deu certo /\
