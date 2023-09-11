package org.example;

class Quad implements Shape {
    private double sideLength;

    public Quad(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String getName() {
        return "Quad";
    }
}