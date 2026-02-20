package Lesson17

static void main(String[] args) {

    println(Person.WELCOME_MSG)
}

class Person {
    //1. propriedades / fields [private - protected - public]

    //1.1 por padrão quando criamos as propriedades, elas já vem como private, com um metodo get e sett não visiveis
    String nome, sobrenome

    //1.2 mas o que acontece se definirmos uma variavel como private no groovy? Ela não vem com get nem set pre-setado, então precisariamos criar na mão
    private Date criadoEm = new Date()

    //1.3 podemos criar sem type definido
    def algoDoPerson

    //2 static field
    //2.1 o campo static nós podemos acessar ele sem precisar instanciar a classe
    //ex: println(Person.welcomeMsg())
    static welcomeMsg = "Hello"

    //2.2 contudo, caso quisermos colocar algo como statico publico e que não seja alteravel de nenhuma forma, colocamos o FINAL
    public static final String WELCOME_MSG = "Hello final"

    // local variables
    def foo(){
        String msg = "Sou uma variavel local do foo, só existo aqui dentro"
    }


}
