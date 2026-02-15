package Lesson10


static void main(String[] args) {

    // Java ::

    char c = 'c'
    println(c.class)

    String str = "this is a string"
    println(str.class)

    // Groovy
    // Por default tudo é uma string
    println("Groovy:")

    def c2 = 'c'
    println(c2.class)

    def str2 = "string aqui"
    println(str2.class)

    // String interpolation
    String nome = "arthur"
    // Line strings - sem poder usar variaveis dentro com interpolação
    println('Olá ' + nome)

    //Gstring ou groovy string
    println("Olá ${nome}")
    println("olha a conta também ${20 + 80}")

    //Multiline strings
    def mensagemGrande = """A
Mensagem
que
sai
quebrada"""
    println(mensagemGrande)

    // Dollar slashy
    // Quando utilizamos o dollar slashy $/ conteudo /$ tudo dentro dele é considerado uma string, sem aplicar aquelas coisas de \ que quebra a string e tudo mais, ótimo para caminho
    def path= $/C:\groovy\eu\foo\bar/$
    println(path)
}
