package com.codegym;

public class Cylinder extends Circle {
    double height;

    public Cylinder() {
        height = 1.0;
    }

    public Cylinder(double height, double radius, String color) {
        this.height = height;
        this.radius = radius;
        this.color = color;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getCapacity() {
        return super.getArea() * this.height;
    }

    public String toString() {
        return "A Cylinder with height= " + this.getHeight() + ", with a capacity of: " + this.getCapacity() + ", which is a subclass of " + super.toString();
    }
}
