package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFile {

  public static void reader(String path) {
    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
      String line = bufferedReader.readLine();
      while (line != null) {
        System.out.println(line);
        line = bufferedReader.readLine();
      }
    } catch (IOException err) {
      System.out.println("Error: " + err.getMessage());
    }
  }
}
