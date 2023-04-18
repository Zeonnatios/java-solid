package org.example;

public class SMS implements MensagemTokenInterface {

  @Override
  public void enviar() {
    System.out.println("Seu token é 9874-1810 By SMS");
  }
}
