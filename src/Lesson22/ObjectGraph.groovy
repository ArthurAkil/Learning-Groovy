package Lesson22

import groovy.transform.ToString

@ToString(includeNames = true)
class Book{
    String title
    String summary
    List<Section> sections = []

}

@ToString(includeNames = true)
class Section{
    String title
    List<Chapter> chapters = []
}

@ToString(includeNames = true)
class Chapter{
    String title
}

ObjectGraphBuilder builder = new ObjectGraphBuilder()
builder.classNameResolver = "Lesson22" //o ObjectGraphBuilder procura no root do projeto e a classe está dentro de Lesson22 então informamos para o builder procurar dentro de Lesson22

def book = builder.book(title: "Groovy In Action 2nd Edition", summary: "Groovy in Action, Second Edition is a touroghly revised, comprehensive guide to Groovy programming.") {
    section(title: "Section 1"){
        chapter(title: "Chapter 1")
        chapter(title: "Chapter 2")
        chapter(title: "Chapter 3")
    }
    section(title: "Section 2"){
        chapter(title: "Chapter 4")
        chapter(title: "Chapter 5")
        chapter(title: "Chapter 6")
    }
}

println(book)