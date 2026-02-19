package Lesson13

import java.util.zip.CheckedInputStream

static void main(String[] args) {

    println("add")
    def numsAdd = [1,2,3,4,5,6,7,8,9]
    // List nums = [1,2,3,4,5,6,7,8,9]

    println(numsAdd)
    println(numsAdd.class.name) // ArrayList

    // add
    numsAdd.add(99)
    numsAdd.putAt(2, 77) // substitui o valor no index pelo valor
    println(numsAdd + [10,11,12])
    // nums + [10,11,12] a lista original fica protegida

    numsAdd << 66 // 66
    println(numsAdd)

    // remove
    println("remove")
    def numsRmv = [1,2,3,4,5,6,7,8,9]
    numsRmv.pop()
    numsRmv.remove(0)
    println(numsRmv)

    def newList = numsRmv - 9 // removemos a ocorrência do 3 na lista
    println(newList)

    // get
    println("get")
    def numsGet = [1,2,3,4,5,6,7,8,9]

    println(numsGet.getAt(3..8)) // O range pega do index 3 até o 8

    // clear
    println("clear")
    def numsClear = [1,2,3,4,5,6,7,8,9]
    println(numsClear.clear())

    // flatten
    println("flatten")
    def numsFla = [1,2,3,4,5,6,7,8,9]
    numsFla << [3,4,5] // adicionando uma lista dentro de outra
    numsFla << [1,2] // adicionando uma lista dentro de outra
    println(numsFla.flatten()) // transformando todas as listas dentro de uma em uma lista em comum
    println(numsFla.flatten().unique())

    // sets
    println("sets")
    def numbers = [1,2,4,12,321,65,1,2,412,5467,123, 213] as Set // LinkedHashSet - unicos mas não organizados
    println(numbers)
    println(numbers.class.name)

    def numbers2 = [1,2,4,12,321,65,1,2,412,5467,123, 213] as SortedSet // TreeSet - organizados e únicos
    println(numbers2)
    println(numbers2.class.name) // Treeset

    // checked - metodo legal groovy 5.0
    def listaOriginal = [0,1]
    def soNumeros = listaOriginal.asChecked(Integer)
    soNumeros.add(2) // passou
    soNumeros.add(3) // passou
    // soNumeros.add("Não sou numero") // error


}
