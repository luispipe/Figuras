package com.example.figuras;

public class Triangulo extends Figura{
    public double base;
    public double altura;

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double perimetro() {
        return 2*(this.base+this.altura);
    }

    @Override
    public double area() {
        return (this.base*this.altura)/2;
    }

    @Override
    public String pintar(int x, int y) {
        return "Se pinto el triangulo de color "+this.color;
    }
}
