package refactoring.entity;

public enum Status {
  ABERTO("Aberto"),
  CONFIRMADO("Confirmado");

  private String status;

  private Status(String status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return status;
  }
}
