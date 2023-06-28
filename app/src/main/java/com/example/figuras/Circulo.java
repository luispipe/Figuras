package com.example.figuras;

import android.graphics.Color;

public class Circulo extends Figura{

    public double radio;

    public Circulo(){
        super("Azul");
        this.radio= 4;
    }

    public Circulo(String color){
        super(color);
        this.radio=3;
    }

    public Circulo(String color,double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double perimetro() {
        return 2*Math.PI*this.radio;
    }

    @Override
    public double area() {
        return Math.PI*(Math.pow(radio,2));
    }

    @Override
    public String pintar(int x, int y) {
        return "Se pinto el circulo de color "+this.color;
    }
}
