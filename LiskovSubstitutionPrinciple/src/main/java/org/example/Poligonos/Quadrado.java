package org.example.Poligonos;

public class Quadrado extends Poligono {

  @Override
  public void setLargura(Double largura) {
    super.setLargura(largura);
    super.setAltura(largura);
  }

  @Override
  public void setAltura(Double altura) {
    super.setAltura(altura);
    super.setLargura(altura);
  }
}
