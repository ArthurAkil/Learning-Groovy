package Lesson16

static void main(String[] args) {

    // if( boolean experssion) {
    // }

    if (true){
        println('true')
    } else {
        println('false')
    }

    def idade = 34
    if (idade >= 20){
        println("Maioridade")
    } else {
        println("Minoridade")
    }

    // operador ternario ou ternary operator (expression) ? true : false
    def nome = "Arthur"
    def nomeArthur = (nome.toLowerCase() == 'arthur') ? "é arthur o nome" : "Não é arthur o nome"
    println(nomeArthur)

    def msg
    def output = (msg != null) ? msg : 'default message..'
    println(output)

    // switch
    def num = 3.toString()
    switch (num){
        case 1:
            println("Caso 1 foi ativado")
            break
        case 2:
            println("Case 2 foi ativado")
            break
        case 1..3:
            println("Case se o numero esta entre 1 e 3")
            break
        case String:
            println('O input é uma string')
            break
        default:
            println("Nenhum caso foi ativado mas o default foi")
    }

    //in
    def idadeValida = 18..35
    def idadeQualquer = 20
    println(idadeQualquer in idadeValida)
}
