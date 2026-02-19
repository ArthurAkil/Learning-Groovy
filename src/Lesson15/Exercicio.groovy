package Lesson15

static void main(String[] args) {
    List people = [
            [name: "Arthur", city:"Santa Luzia"],
            [name: "Mariah", city:"Patos"],
            [name: "GF", city:"Patos"],
            [name: "Lucas", city:"Santa Luzia"],
            [name: "Thiago", city:"Santa Luzia"],
            [name: "Gisete", city:"Patos"]
    ]

    def peopleByCity = people.groupBy {person -> person.city}

    println(peopleByCity)

    def santaLuzia = peopleByCity["Santa Luzia"]
    def patos = peopleByCity.Patos

    println(santaLuzia)
    println(patos)
}
