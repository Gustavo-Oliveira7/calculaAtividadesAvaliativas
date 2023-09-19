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

    int[] arrayPeso;
    int[] arrayNota;
    int total = 0;
    int peso = 0;
    arrayPeso = new int[count];
    arrayNota = new int[count];

    for (int i = 0; i < count; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      String nomeAtividade = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + (i + 1) + ":");
      int pesoAtividade = Integer.parseInt(scanner.nextLine());
      arrayPeso[i] = pesoAtividade;
      System.out.println("Digite a nota obtida para " + nomeAtividade + ":");
      int notaAtivdade = Integer.parseInt(scanner.nextLine());
      arrayNota[i] = notaAtivdade;

    }
    scanner.close();

    for (int i = 0; i < count; i++) {
      int nota = arrayNota[i] * arrayPeso[i];
      peso += arrayPeso[i];
      total += nota;
    }
    int notaTotal = total / peso;
    if (notaTotal < 85) {
      System.out.println("Lamentamos informar que, "
          + "com base na sua pontuação alcançada neste período, " + notaTotal + ".0%, "
          + "você não atingiu a pontuação mínima necessária para sua aprovação.");
    } else {
      System.out.println("Parabéns! Você alcançou " + notaTotal + ".0%! "
          + "E temos o prazer de informar que você "
          + "obteve aprovação! ");
    }
  }
}