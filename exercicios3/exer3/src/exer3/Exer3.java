/*

 */
package exer3;

import java.util.Scanner;

public class Exer3 {
     String nome;
    int num;

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Ola");

        System.out.println("Digite seu nome:");
        String nome = ler.nextLine();

        System.out.println("Digite um número para e vou dizer se o mesmo é Par ou Ímpar:");
        double num = ler.nextDouble();


        if (num%2 == 0) {
            System.out.println("Esse número é um número  PAR!");
        }else {
            System.out.println("Esse número é um número ÍMPAR!");
        }
    }


    
}
