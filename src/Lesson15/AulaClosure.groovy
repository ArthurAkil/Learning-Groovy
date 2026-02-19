package Lesson15

static void main(String[] args) {
    def c = {}

    println(c.class.name)
    println(c instanceof groovy.lang.Closure)

    def digaOla = { String nome, sobrenome ->
        println("Olá $nome $sobrenome")
    }
    digaOla("Tutu", "Carai")

    List nums = [1, 5, 2, 7, 10, 23, 72]

    nums.each { it ->
        if (it % 2 == 0){
            println(it)
        }
    }

    // closure como objetos e ultimo parametro
    new AulaClosure().vezesDez(10, { println it })

    10.times {
        print(it)
    }
    println()

    Random rando = new Random()

    3.times {
        println(rando.nextInt(1, 10))
    }

}

    def vezesDez(num, closure){
        closure(num * 10)
    }
