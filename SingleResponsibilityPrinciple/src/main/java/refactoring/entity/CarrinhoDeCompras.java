package refactoring.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarrinhoDeCompras {

  private List<Product> itens;

  public CarrinhoDeCompras() {
    this.itens = new ArrayList<Product>();
  }

  public void adicionarItem(Product product) {
    this.itens.add(product);
  }

  public List<Product> exibirCarrinho() {
    return Collections.unmodifiableList(itens);
  }

  public boolean isEmpty() {
    return itens.isEmpty();
  }

  @Override
  public String toString() {
    return "CarrinhoDeCompras{ itens = " + itens + "}";
  }
}
