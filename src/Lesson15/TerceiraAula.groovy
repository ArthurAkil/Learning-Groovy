package Lesson15

static void main(String[] args) {
    
    
    //each e eachWithIndex
    List favNum = [2, 54, 23, 5, 1]
    
    for (num in favNum){
        println(num)
    }

    favNum.each {
        println(it)
    }
    
    favNum.eachWithIndex{
        int entry, int i ->
            // entry seria o valor iterado e i o index
         {
            println("$i : $entry")
         }
    }

    // findAll e findAll(Com closure)

    List dias = ["Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"]

    List diasSelecionadosComS = dias.findAll({
        it.startsWith("S")
    })

    println(dias)
    println(diasSelecionadosComS)

    // collect

    List nums = [1, 2, 2 ,5, 1, 7, 21, 12]

    // faz o trabalho mas existe uma forma melhor
    List numsVezesDez = []
    nums.each {num ->
        numsVezesDez << num * 10
    }

    // forma melhor com collect, que itera sobre os valores transformando cada um em um valor novo e retornando uma lista com os valores transformados
    List newTimesTen = nums.collect { num ->
        num * 10
    }


    println(nums)
    println(numsVezesDez)
    println(newTimesTen)
}
