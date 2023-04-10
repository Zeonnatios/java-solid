package org.example.Poligonos;

public abstract class Poligono {
  private Double largura;
  private Double altura;

  public Double calcularArea() {
    return largura * altura;
  }

  public Double getLargura() {
    return largura;
  }

  public void setLargura(Double largura) {
    this.largura = largura;
  }

  public Double getAltura() {
    return altura;
  }

  public void setAltura(Double altura) {
    this.altura = altura;
  }
}
