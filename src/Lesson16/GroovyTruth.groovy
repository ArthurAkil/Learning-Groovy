package Lesson16

static void main(String[] args) {

    // Estudo padrão de como o Groovy entende o que é true ou false

    //Boolean
    assert true
    assert !false

    // Matcher
    assert ('a' =~ /a/)
    assert !('a' =~ /b/)

    //Collections
    assert [1]
    assert ![]

    //Map
    assert [1:'one']
    assert ![:]

    //String
    assert 'a'
    assert !''

    //Number
    assert 1
    assert 3.5
    assert !0

    //None of the above
    assert new Object()
    assert !null

}