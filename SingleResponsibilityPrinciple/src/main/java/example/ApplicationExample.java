package example;

import java.util.ArrayList;
import java.util.List;

public class ApplicationExample {

  public static void main(String[] args) {

    List<Product> items = new ArrayList<Product>();
    Product product01 = new Product("Cup", 5.15);
    Product product03 = new Product("Water", 1.45);
    Product product02 = new Product("Toddy", 3.40);

    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras(items, Status.ABERTO);

    System.out.println(carrinhoDeCompras);

    carrinhoDeCompras.adicionarItem(product01);
    carrinhoDeCompras.adicionarItem(product02);
    carrinhoDeCompras.adicionarItem(product03);
    System.out.println(carrinhoDeCompras);
    System.out.println(carrinhoDeCompras.exibirStatus());
    System.out.println(carrinhoDeCompras.exibirCarrinho());
    carrinhoDeCompras.confirmarPedido();
    System.out.println(carrinhoDeCompras.exibirStatus());

  }
}
