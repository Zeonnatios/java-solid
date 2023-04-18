package org.example;

public class Main {
  public static void main(String[] args) {

    Email email = new Email();
    Mensageiro mensageiro = new Mensageiro(email);
    mensageiro.setMensagemTokenInterface(email);
    mensageiro.enviarToken();

    SMS sms = new SMS();
    mensageiro.setMensagemTokenInterface(sms);
    mensageiro.enviarToken();

    Mensageiro mensageiroWhatsApp = new Mensageiro(new Whatsapp());
    mensageiroWhatsApp.enviarToken();
  }
}
