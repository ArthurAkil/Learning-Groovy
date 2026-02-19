package Lesson14

static void main(String[] args) {

    // enum
    println("enum")
    def rngDias = Dia.SEGUNDA..Dia.DOMINGO
    println(rngDias.toList())
    println(rngDias.size())
    println(rngDias.contains(Dia.SABADO))
    println(rngDias.from)
    println(rngDias.to)

    // lista
    println("lista")
    def listDias = ["Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo"]
    println(listDias)
    println(listDias.size())
    listDias.remove("Sabado")
    println(listDias)
    listDias.add(5, "Sabado")
    println(listDias)
    println(listDias.get(2))

    //map
    println("map")
    def mapDias = [1: "Segunda", 2: "Terca", 3: "Quarta", 4: "Quinta", 5: "Sexta", 6: "Sabado", 7: "Domingo"]
    println(mapDias.toString())
    println(mapDias.getClass().name)
    println(mapDias.size())
    println(mapDias.values())






}

enum Dia {
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO,
    DOMINGO
}
