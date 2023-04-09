package example;

import java.util.Collections;
import java.util.List;

public class CarrinhoDeCompras {

  private List<Product> itens;
  private Status status;
  private Double valorTotal;

  public CarrinhoDeCompras(List<Product> itens, Status status) {
    this.itens = itens;
    this.status = status;
    this.valorTotal = 0.0;
  }

  public void adicionarItem(Product item) {
    this.itens.add(item);
    this.valorTotal = calcularTotal();
  }

  public List<Product> exibirCarrinho() {
    return Collections.unmodifiableList(itens);
  }

  public Double calcularTotal() {
    Double total = 0.0;
    for (Product product : itens) {
      total += product.getPrice();
    }
    return total;
  }

  public Status exibirStatus() {
    return this.status;
  }

  public void confirmarPedido() {
    this.status = Status.CONFIRMADO;
    enviarEmailPedidoConfirmado();
  }

  public void enviarEmailPedidoConfirmado() {
    System.out.println("Pedido confirmado...");
  }

  public List getItens() {
    return itens;
  }

  public Status getStatus() {
    return status;
  }

  public Double getValorTotal() {
    return valorTotal;
  }

  @Override
  public String toString() {
    return "example.CarrinhoDeCompras{"
        + "itens="
        + itens
        + ", status="
        + status
        + ", valorTotal="
        + valorTotal
        + '}';
  }
}
