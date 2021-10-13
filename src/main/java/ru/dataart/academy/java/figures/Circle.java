package ru.dataart.academy.java.figures;

public class Circle extends Figure {

    public int r;
    public final double PI = 3.14;

    public Circle(int r){
        this.r = r;
    }

    public double calculateArea(){
        return PI * r * r;
    }

    public double calculatePerimeter(){
        return 2 * PI * r;
    }
}
