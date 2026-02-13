package Lesson4

static void main(String[] args) {


    if (true) {
        println("valor é true")
    }

    if(false){
        println("valor é falso")
    }

    String name = null

    if (name){ // false
        println("name possui um valor")
    }

    // null é reconhecido como false

    String last = ""

    if (last){ // false
        println("last possui um valor")
    }

    // uma string vazia ou variavel vazia é considerada false também

    String[] nomes = []

    if (nomes){ // false - lista vazia não é considerada true e sim false
        println("lista vazia é true")
    }

    // while e for continua a mesma coisa que java
    int x = 1
    while(x < 10){
        println("$x - valor x")
        x++
    }
}
