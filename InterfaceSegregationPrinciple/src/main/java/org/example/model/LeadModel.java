package org.example.model;

import org.example.DatabaseConnectionExample;
import org.example.components.Log;
import org.example.components.Notificacao;
import org.example.model.interfaces.CadastroInterface;
import org.example.model.interfaces.LogInterface;

public class LeadModel extends DatabaseConnectionExample
    implements CadastroInterface, LogInterface {

  @Override
  public void salvar() {
    System.out.println("salvo");
  }

  @Override
  public void registrarLog(Log log) {
    System.out.println(log);
  }

}
