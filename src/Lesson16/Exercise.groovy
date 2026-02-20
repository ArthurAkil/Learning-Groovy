package Lesson16

static void main(String[] args) {

    Account a1 = new Account()

    try{
        a1.deposit(20)
        a1.deposit(20,10)
        a1.deposit(11, 15, -20)

    } catch (Exception e){
        println(e.message)
    }

}

class Account {
    BigDecimal balance = 0.0

    void deposit(BigDecimal... valors){
        for (valor in valors){
            if (valor < 0){
                throw new Exception("Valor $valor inaceitável.")
            } else{
                balance += valor
                println("Valor de: $valor adicionado, total: $balance")
            }
        }
    }


}