package Lesson15

static void main(String[] args) {


    // owner, delegate e this

    //this - corresponds to the enclosing class where the closure is defined
        // se fizemos uma closure dentro de uma classe, this seria referenciado a classe, mesma coisa se fosse para um script vazio, ele seria referenciado ao script

    //owner - corresponds to the enclosing object where the closure is defined, which may be either a class or a closure
        // ire se referenciar ao objeto delimitador onde a closure é definida, ou seja, pode se referenciar a uma closure maior que cria essa closure menor dentro dela

    //delegate - corresponds to a third party object where methods calls or properties are resolved whenever the receiver of the message is not defined

    def demo = new ScopeDemo()
    demo.outerClosure()
    println("---------------")

    def writer = {
        append 'Dan'
        append 'Den'
    }

    StringBuffer sb = new StringBuffer()

    writer.resolveStrategy = Closure.OWNER_FIRST

    writer.delegate = sb // estou setado que estou só mudando onde o Groovy vai procurar append se ele decidir usar o delegate. StringBuffer class POSSUI dentro dele um metodo append e o execute
    // mesmo que possua um metodo já definido


    println(writer())
}

static def append(String s){
    println("append() called with argument of $s")
}

class ScopeDemo {
    def outerClosure = {
        println(this.class.name)
        println(owner.class.name)
        println(delegate.class.name)

        def nestedClosure = {
            println(this.class.name)
            println(owner.class.name)
            println(delegate.class.name)
        }
        nestedClosure()
    }
}