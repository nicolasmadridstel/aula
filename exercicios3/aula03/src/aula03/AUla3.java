/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

import java.util.Scanner;


public class AUla3 {

    /**
     * @param args the command line arguments
     */
  String nome;
    int num;

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Ola");

        System.out.println("Digite seu nome:");
        String nome = ler.nextLine();

        System.out.println("Digite um número e irei  dizer se o mesmo é Par ou Ímpar:");
        double num = ler.nextDouble();


        if (num%2 == 0) {
            System.out.println("Esse número é um número  PAR!");
        }else {
            System.out.println("Esse número é um número ÍMPAR!");
        }
    }
    
}
