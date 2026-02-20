package Lesson21

import groovy.transform.ToString
//criar uma classe na mão no groovy - mais simples menos verboso
@ToString
class Employee implements Serializable{
    String first, last, email

    Integer age;

    Integer getAge() {
        return age
    }

    void setAge(Integer age) {
        this.age = age
    }
}
