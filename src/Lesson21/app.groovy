package Lesson21

// Employee emp = new Employee(first: "AA", last: "BB", email: "aa@email.com")

Employee emp = new Employee()
emp.first = "AA"

println(emp.first)

DoubleBean db = new DoubleBean()

db.value = 2

println(db.value) // estamos fazendo pelo getter que duplica o valor

println(db.@value) // aqui estamos pegando valor real da propriedade



