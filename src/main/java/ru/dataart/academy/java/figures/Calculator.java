package ru.dataart.academy.java.figures;

public class Calculator {

    public double calculate(Figure[] figures){
        double result = 0;
        for(Figure x : figures){
            result += x.calculateArea();
        }
        return result;
    }
}
