package Lesson15



static void main(String[] args) {

    // Parametro implicito
    def ola = {
        println(it) // refereciamos como it quando so temos um parametro pois fica mais simples de ser tratado ja que o it vem nativo na closure para tratar com parametros unicos
    }

    ola("qqualquer coisa")

    // Nenhum parametro
    def nenhumParam = { -> // colocamos uma arrow com nenhum parametro atras dela, assim a closure não recebe parametro
        println("nenhum parametro")
    }

    nenhumParam()
    // nenhumParam(1) //erro

    def deBomdia ={String nome, String sobrenome -> // podemos
        println("Bom dia, ${nome} ${sobrenome}")
    }

    deBomdia("Arthur", "AA")

    // default values
    def greet = {String nome, String greeting = "Opa!" -> //colocamos o greeting com um valor default
        println("${greeting}, ${nome}")
    }

    greet("Hello", "tutu")
    greet("Tutu")

    // var-args
    def concat = { String... arg ->
        arg.join('')
    }

    println(concat("alo", "ola"))
    println(concat("alo", "ola", "sdasdasd", "sadasd"))

    def someClousure = {
        int x, int y ->
            x + y
    }

    someMethod(someClousure)


}

    static void someMethod(Closure c) {
        println("...")
        println(c.maximumNumberOfParameters)
        println(c.parameterTypes)
    }

