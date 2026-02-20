package Lesson16

static void main(String[] args) {

    def scanner = new Scanner(System.in)
    println("Você tem mais de 18 anos? ")

    // while
    while (true){
        try{
            int idade = scanner.nextInt()
            if (idade > 18){
                println("Entrada permitida")
                break
            } else {
                println("Idade necessaria 18+, Digite novamente: ")
            }
        } catch (InputMismatchException e){
            println("Digite uma entrada permitida.")
            scanner.nextLine()
        } finally {
            scanner.close()
        }
    }

    // for
    List nums = [1,2,3]
    for (Integer numero in nums) {
        println(numero)
    }
    for (i in 1..4){
        println(i)
    }


    // each e forEach
    nums.forEach {
        println("Vim do forEach: $it")
    }
    nums.each {
        println("Vim do each: $it")
    }
    nums.eachWithIndex { int entrada, int index ->
        println("Vim do each com index: index[$index] - iterador[$entrada]")
    }

    // return/break/continue
    def a = 1
    while (true){
        if (a == 3){
            println("'a' chegou a 3, parou")
            break
        }
        a++
    }

    for (String i in 'a'..'z'){
        if (i == 'd') continue
        if (i > 'e') {
            println("Passei do e")
            break
        }
    }
}
