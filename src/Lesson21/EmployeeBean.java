package Lesson21;

import java.io.Serializable;

// exemplo de criar uma classe na mao do Java
public class EmployeeBean implements Serializable {

    // private properties
    private String first;
    private String last;
    private String email;

    // public no-arg constructor
    public EmployeeBean(){

    }
    // getters e setters

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
