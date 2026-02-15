package Lesson11

import java.util.regex.*

static void main(String[] args) {

    //Operators

    // find operator (=~)
    // you can directy use the find operator =~ to build a java.util.regexMatcher instance

    // match operator (==~)
    // the match operator (==~) is a slight variation of the find operator, that dos not return a Matcher but a boolean and requires a strict match of the input string:

    // pattern operator (~string)
    // The pattern operator (~) provides a simples way to create a java.util.regex.Pattern instance

    // pattern abc
    // matches any string that contains a followed by b followed by c

    // pattern b[aeiou]t
    // matches bat, bet, bit, bot and but

    // pattern <TAG\b[^>]*>(.*?)</TAG>
    // matche the opening and closing pair of a specific HTML tag

    // pattern \b[A-Z0-9._%=+-]+@[A-Z0-9.-]+\.[A-Z]{2,}\b
    // mathes any email address

    // Java Sample Pattern
    Pattern pattern = Pattern.compile("a\\\\b")
    println(pattern)
    println(pattern.class)

    // What patterns will look like in groovy
    String slashy = /a\b/
    String url = $/https://google.com.br/$
    println(url.class)

    def pattern2 = ~/a\b/
    println(pattern2)
    println(pattern2.class)

    // find / match

    def text = "Bring a cleveland sports fans is no way to go through life"
    def pattern3 = ~/cleveland sports/
    def finder = text =~ pattern3
    def matcher = text ==~ pattern3

    println(finder)
    println(finder.size())
    println(matcher)

    def text2 = "Futball is cool"
    def pattern4 = ~/Futball is cool/

    def matcher2 = text2 ==~ pattern4
    println(matcher2)

    if (matcher2){
        //do something
    }

    text = text.replaceFirst(pattern3, "replace first")

    println(text)
}