package Lesson16

static void main(String[] args) {

    // Exceptions


    // Grande diferença do Java e Groovy em exceptions
    /* Java
        No java quando vamos declarar uma exceção fazemos:
        public void olhaExcecao() throws Exception {
            throw new Exception()
        }
    */

    /* Groovy
        No groovy não precisamos declarar essa exceção na assinatura
        def olhaExcecao() {
            throw new Exception()
        }
    */

    List log = []

    try {
        foo()
    } catch (Exception e){
        log << e.message
    } finally {
        log << 'Finally'
    }

    println(log)



}

static void foo() {
    throw new Exception("Foo exception")
}

