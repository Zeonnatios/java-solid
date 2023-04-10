package org.example;

import org.example.Poligonos.Poligono;
import org.example.Poligonos.Quadrado;
import org.example.Poligonos.Retangulo;

public class Main {
  public static void main(String[] args) {

    System.out.println("Hello world!");

    Poligono retangulo = new Retangulo();
    retangulo.setLargura(3.0);
    retangulo.setAltura(4.0);
    System.out.println(retangulo.calcularArea());

    Poligono quadrado = new Quadrado();
    quadrado.setAltura(4.0);
    System.out.println(quadrado.calcularArea());

  }
}
