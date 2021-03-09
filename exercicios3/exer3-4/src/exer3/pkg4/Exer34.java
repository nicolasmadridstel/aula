/*

 */
package exer3.pkg4;

import java.util.Scanner;

public class Exer34 {
      String nome;
    double num1, num2;

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Ola");

        System.out.println("Digite seu nome:");
        String nome = ler.nextLine();

        System.out.println("Digite dois valores e direi qual é maior!");

        System.out.println("Digite o primeiro valor:");
        double num1 = ler.nextDouble();

        System.out.println("Digite o segundo valor:");
        double num2 = ler.nextDouble();


        if (num1 > num2){
            System.out.println("O primeiro valor é o maior!");
        }else if (num1 == num2 ){
            System.out.println("Os valores são IGUAIS!");
        }else {
            System.out.println("O segundo valor é MAIOR!");
        }
    }

    
}
