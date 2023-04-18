package org.example;

public class Email implements MensagemTokenInterface {

  @Override
  public void enviar() {
    System.out.println("Seu token é 1234-5678-abcd-!@#$ By Email");
  }
}
