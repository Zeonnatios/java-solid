package org.example.model;

import org.example.DatabaseConnectionExample;
import org.example.components.Log;
import org.example.components.Notificacao;
import org.example.model.interfaces.CadastroInterface;
import org.example.model.interfaces.LogInterface;
import org.example.model.interfaces.NotificacaoInterface;

public class UsuarioModel extends DatabaseConnectionExample
    implements CadastroInterface, LogInterface, NotificacaoInterface {

  @Override
  public void salvar() {
    System.out.println("salvo");
  }

  @Override
  public void registrarLog(Log log) {
    System.out.println(log);
  }

  @Override
  public void enviarNotificacao(Notificacao notificacao) {
    System.out.println(notificacao);
  }
}
