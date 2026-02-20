package Lesson22

import groovy.xml.MarkupBuilder

FileWriter writer = new FileWriter('html/about.html')

MarkupBuilder builder = new MarkupBuilder(writer)

List courses = [
        [id: 1, name: "Apache Groovy"],
        [id:2, name: "Spring Boot"]
]

builder.html {
    head{
        title "About the site"
        description "This is an about me page"
        keywords "site, Groovy, Java, Spring"
    }
    body {
        h1 "About me"
        p "This is a bunch of text about me.."
        section {
            h2 "Courses"
            table{
                tr{
                    th "id"
                    th "name"
                }
                courses.each {course ->
                    tr {
                        td course.id
                        td course.name
                    }
                }
            }
        }
    }
}

