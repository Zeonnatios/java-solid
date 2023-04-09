package org.example;

public class Main {
  public static void main(String[] args) {

    String diretorio =
        "C://Users//mathe//IdeaProjects//javasolid//OpenClosedPrinciple//src//main//resources/";
    String pathTxt = diretorio + "dados.txt";
    String pathCsv = diretorio + "dados.csv";

    ReaderFile.reader(pathTxt);
    ReaderFile.reader(pathCsv);
  }
}
