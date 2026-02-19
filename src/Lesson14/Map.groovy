package Lesson14

static void main(String[] args) {

    def map = [:]
    // LinkedHashMap map =[:]
    // Map map =[:]
    println(map)
    println(map.getClass().name)
    // println(map.class.name) //error, pois procura uma propriedade no map chamado nome, mas ele não tem propriedade, ele tem chave e valor, key / value

    def person = [first: "Primeiro nome", last: "Sobrenome", email: "Email@email.com"]
    println(person)
    println(person.first)
    println(person.last)
    println(person.email)

    person.twitter = "@nomeTwitter"
    println(person.twitter)

    println(person)
    println(person.size())
    println(person.sort())

    // iterando
    for (p in person){
        println(p)
    }

    for (key in person.keySet()){
        println("${key}: ${person[key]}")
    }

}
