package refactoring;

import refactoring.entity.*;
import refactoring.service.EmailService;

import java.util.ArrayList;
import java.util.List;

public class ApplicationRefactoring {

  public static void main(String[] args) {

    Product product01 = new Product("Cup", 5.15);
    Product product02 = new Product("Water", 1.45);
    Product product03 = new Product("Toddy", 3.40);

    Pedido pedido = new Pedido();

    pedido.getCarrinhoDeCompras().adicionarItem(product01);
    pedido.getCarrinhoDeCompras().adicionarItem(product02);
    pedido.getCarrinhoDeCompras().adicionarItem(product03);
    System.out.println(pedido.getCarrinhoDeCompras().exibirCarrinho());
    System.out.println(pedido.getStatus());
    pedido.confirmarPedido();
    System.out.println(pedido);

    if (pedido.getStatus() == Status.CONFIRMADO) {
      EmailService.enviarEmail();
    }
  }
}
