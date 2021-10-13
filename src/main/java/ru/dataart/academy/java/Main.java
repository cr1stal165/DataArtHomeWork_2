package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Calculator;
import ru.dataart.academy.java.figures.Circle;
import ru.dataart.academy.java.figures.Figure;
import ru.dataart.academy.java.figures.Rectangle;

public class Main{
    public static void main(String[] args) {
        System.out.print("Task for Java OOP");

        Figure[] figures = {new Circle(12), new Circle(24), new Rectangle(2,7),
                            new Rectangle(12,46), new Circle(7), new Circle(9)};

        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(figures));
    }
}