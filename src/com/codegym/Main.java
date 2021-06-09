package com.codegym;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle(5, "green");
        System.out.println(circle);
        System.out.println(circle1);
        Cylinder cylinder= new Cylinder();
        Cylinder cylinder1 = new Cylinder(3,5,"red");
        System.out.println(cylinder);
        System.out.println(cylinder1);
    }
}
