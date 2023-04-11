package org.example.model;

import org.example.DatabaseConnectionExample;
import org.example.components.Log;
import org.example.components.Notificacao;
import org.example.model.interfaces.CadastroInterface;
import org.example.model.interfaces.LogInterface;
import org.example.model.interfaces.NotificacaoInterface;

public class ContratoModel extends DatabaseConnectionExample implements CadastroInterface {

  @Override
  public void salvar() {
    System.out.println("salvo");
  }
}
