package Lesson15

static void main(String[] args) {


    def log = { String type, Date createdOn, String msg ->
        println("${createdOn}, [${type}] - $msg")
    }

    log("Debug", new Date(), "Esse é o primeiro debug statement...")

    // Com o curry nós pegamos uma closure já antes definida e já adicionamos algo para que a nossa closure atual precise de um parametro a menos, ou seja, ja definimos o type de debugLog
    def debugLog = log.curry("DEBUG")
    debugLog(new Date(), "Esse é o segundo statement... feito com curry")

    def todayDebugLog = log.curry("DEBUG", new Date())
    todayDebugLog("Esse statement foi criado apenas preenchendo o parametro msg....")

    // right curry
    def crazyPersonLog = log.rcurry("Fui preenchido pela direito primeiro, ou seja, o campo de msg")
    crazyPersonLog("ERROR", new Date())

    // index based currying
    def typeMsgLog = log.ncurry(1, new Date())
    typeMsgLog("ERROR", "Agora essa mensagem foi usando o ncurry que preenche buscando pelo index dos parametros")
}
