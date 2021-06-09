package com.codegym;

public class Circle {
    double radius;
    String color;

    public Circle() {
        radius = 1;
        color = "black";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public String toString() {
        return "A circle with radius= " + this.getRadius() + ", with area= " + this.getArea() + ", and painted with color: " + this.getColor();
    }
}
