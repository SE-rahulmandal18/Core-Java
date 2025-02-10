package com.example77.geometry;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length=length;
        this.breadth=breadth;
    }

    public double getLength(){
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setLength() {
        this.length=length;
    }

    public void setBreadth() {
        this.breadth=breadth;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rectangle{");
        sb.append("length=").append(length);
        sb.append(", breadth=").append(breadth);
        sb.append('}');
        return sb.toString();
    }
}
