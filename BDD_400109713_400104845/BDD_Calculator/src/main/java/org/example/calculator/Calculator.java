package org.example.calculator;


public class Calculator {
    private int result;

    public void calculateRootOfDivision(int a, int b) {
        result = (int) Math.sqrt(a / b);
    }

    public int getResult() {
        return result;
    }
}

