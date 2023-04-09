package refactoring.entity;

public class Pedido {
  private Status status;
  private CarrinhoDeCompras carrinhoDeCompras;
  private Double valorTotal;

  public Pedido() {
    this.status = Status.ABERTO;
    this.carrinhoDeCompras = new CarrinhoDeCompras();
    this.valorTotal = 0.0;
  }

  public void calcularTotal() {
    Double total = 0.0;
    for (Product product : carrinhoDeCompras.exibirCarrinho()) {
      total += product.getPrice();
    }
    this.valorTotal = total;
  }

  public void confirmarPedido() {
    if (!this.carrinhoDeCompras.isEmpty()) {
      calcularTotal();
      setStatus(Status.CONFIRMADO);
    }
  }

  public CarrinhoDeCompras getCarrinhoDeCompras() {
    return carrinhoDeCompras;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Pedido{"
        + "status="
        + status
        + ", carrinhoDeCompras="
        + carrinhoDeCompras
        + ", valorTotal="
        + valorTotal
        + '}';
  }
}
