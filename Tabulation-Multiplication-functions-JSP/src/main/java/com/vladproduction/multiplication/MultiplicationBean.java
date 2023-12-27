package com.vladproduction.multiplication;

public class MultiplicationBean {

    private int num1;
    private int num2;
    private int result;

    public MultiplicationBean(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = multiple();
        this.result = divide();
        this.result = sum();
        this.result = subtract();
    }

    public int multiple() {
        return num1 * num2;
    }
    public int divide() {
        return num1 / num2;
    }
    public int sum() {
        return num1 + num2;
    }
    public int subtract() {
        return num1 - num2;
    }

}
