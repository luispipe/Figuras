package com.example.figuras;

public abstract class Figura {
    public String color;

    public Figura(String color) {
        this.color=color;
    }

    public abstract double perimetro();
    public abstract double area();
    public abstract String pintar(int x,int y);

}
