package refactoring.service;

public class EmailService {

  private String remetente;
  private String destinatario;
  private String assunto;
  private String conteudo;

  public EmailService(String remetente, String destinatario, String assunto, String conteudo) {
    this.remetente = remetente;
    this.destinatario = destinatario;
    this.assunto = assunto;
    this.conteudo = conteudo;
  }

  public static void enviarEmail() {
    System.out.println("--- Envio de email ---");
  }
}
