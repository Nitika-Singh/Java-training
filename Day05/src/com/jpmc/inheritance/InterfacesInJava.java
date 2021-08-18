package com.jpmc.inheritance;

public class InterfacesInJava {
    public static void main(String[] args) {
        DrawingShape circle = new Circle();
        DrawingShape square = new Square();
        drawShape(circle);
        drawShape(square);
        //DrawingShape ds = new DrawingShape(); //CANNOT BE INSTANTIATED
        ShapeWithArea circle2 = new Circle();
        ShapeWithArea sq2 = new Square();
    }
    public static void drawShape(DrawingShape shape) {
        shape.draw();
    }

}

interface ShapeWithArea {
    abstract void calculateArea();
}

interface DrawingShape {
    abstract void draw();
}
//Multiple inheritance is not possible using classes in Java
//One class can extend only one other class
class Circle implements DrawingShape, ShapeWithArea {
    public void draw() {}
    public void calculateArea() {}
}
class Square implements DrawingShape, ShapeWithArea {
    public void draw() {}
    public void calculateArea() {}
}