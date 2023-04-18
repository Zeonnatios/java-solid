package org.example;

public class Mensageiro {

  MensagemTokenInterface mensagemTokenInterface;

  public Mensageiro(MensagemTokenInterface mensagemTokenInterface) {
    this.mensagemTokenInterface = mensagemTokenInterface;
  }

  public MensagemTokenInterface getMensagemTokenInterface() {
    return mensagemTokenInterface;
  }

  public void setMensagemTokenInterface(MensagemTokenInterface mensagemTokenInterface) {
    this.mensagemTokenInterface = mensagemTokenInterface;
  }

  public void enviarToken() {
    this.mensagemTokenInterface.enviar();
  }
}
