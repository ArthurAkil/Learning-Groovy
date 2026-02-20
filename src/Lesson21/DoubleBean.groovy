package Lesson21

class DoubleBean {

    public Integer value

    // não retorna o value em si, mas sim duplicado
    Integer getValue() {
        return value * 2
    }

    void setValue(Integer value) {
        this.value = value
    }
}
