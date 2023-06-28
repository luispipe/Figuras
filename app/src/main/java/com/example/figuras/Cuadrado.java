package com.example.figuras;

public class Cuadrado extends Figura{
    public double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        return this.lado*4;
    }

    @Override
    public double area() {
        return this.lado*this.lado;
    }

    @Override
    public String pintar(int x, int y) {
        return "Se pinto el cuadrado de color "+this.color;
    }
}
