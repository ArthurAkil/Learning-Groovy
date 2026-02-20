package Lesson20.service

interface IPersonService {

    // normalmente não podemos colocar um corpo nos metodos da interface, mas colocando "default" podemos fazer isso
    default public void doSomething(){
        System.out.println("doing something..")
    }

}