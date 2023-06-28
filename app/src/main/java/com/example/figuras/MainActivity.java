package com.example.figuras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Objeto circulos
        Circulo maya= new Circulo("Azul",3);
        Circulo titan= new Circulo("Rojo",5);
        Cuadrado garfio= new Cuadrado("Verde",2);
        Cuadrado sami= new Cuadrado("Azul",4);
        Triangulo bugs= new Triangulo("Morado",4,5);

        //Calcular perimetros
        Log.i("maya",maya.perimetro()+"");
        Log.i("titan",titan.perimetro()+"");
        Log.i("garfio",garfio.perimetro()+"");
        Log.i("sami",sami.perimetro()+"");
        Log.i("bugs",bugs.perimetro()+"");
        //Calcular Areas
        Log.i("maya",maya.area()+"");
        Log.i("titan",titan.area()+"");
        Log.i("garfio",garfio.area()+"");
        Log.i("sami",sami.area()+"");
        Log.i("bugs",bugs.area()+"");
        //Pintar figuras
        Log.i("maya",maya.pintar(4,5));
        Log.i("titan",titan.pintar(3,4));
        Log.i("garfio",garfio.pintar(6,6));
        Log.i("sami",sami.pintar(3,3));
        Log.i("bugs",bugs.pintar(3,5));


    }
}