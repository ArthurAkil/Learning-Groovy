package Lesson6

static void main(String[] args) {

//    arithmetic operators

    10 + 2
    10 - 1
    10 * 2
    10 / 5
    10 % 3
    10**2 // elevação 10 ** 10, 10 ** 3 = 10 * 10 * 10

    // soma na variavel

    def a = 10
    a += 5
    println(a)

    // ==, !, !=, <, <=, >, >=

    // true, false, ||, &&

    String s = ""

    def result = s != null && s.length() > 0 ? "found" : "not found"
    println(result)

    // Object operators
    // Safe navigation operator

    // Java
    Person p = new Person()
    if (p.name != null) {
        String name = "Arthur"
        p.name = name
    }
    println(p)

    // Groovy
    def nome = p?.name // safe - vai evitar que solte um erro de nullPointerException, verificando assim se o p?.name realmente existe, se for null ele vai guardar o resultado para tratar

    println(nome)


}

class Person{
    String name, last
}