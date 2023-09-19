package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main!.
   */
  public static void main(String[] args) {
    cadastrarAtividadesAvaliativas();
  }

  /**
   * Método cadastra atividades.
   */

  public static void cadastrarAtividadesAvaliativas() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int count = Integer.parseInt(scanner.nextLine());
    for (int i = 1; i <= count; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");
      String nomeAtividade = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + i + ":");
      int pesoAtividade = Integer.parseInt(scanner.nextLine());
      System.out.println("Digite a nota obtida para " + nomeAtividade + ":");
      int notaAtivdade = Integer.parseInt(scanner.nextLine());

    }
    scanner.close();
  }
}