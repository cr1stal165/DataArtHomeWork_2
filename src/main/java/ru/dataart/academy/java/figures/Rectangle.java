package ru.dataart.academy.java.figures;

public class Rectangle extends Figure{
    public int a;
    public int b;

    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    public double calculateArea(){
        return a * b;
    }

    public double calculatePerimeter(){
        return 2 * a + 2 * b;
    }
}
