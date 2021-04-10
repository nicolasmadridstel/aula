/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class desafio1 {

    private static Object Tela;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner ler = new Scanner(System.in);
          ArrayList<Integer> nums = new ArrayList<>();
    int numDigitado, numeros, qtd=0, soma=0;
     byte op;

    do {

      System.out.print("Lista de Compras\n"
              + " 1  -  Adicionar numeros                                      \n"
              + " 2  -  Consultar                                               \n"
              + " 0  -  SAIR                                                    \n"
              + "...\n"
              + "DIGITE A OPÇÃO: ");

      op = leia.nextByte();

      switch (op) {
        case 1 -> {
          
            System.out.print("Digite um número: ");
            numeros = leia.nextInt();
            nums.add(numeros);
                 }
        case 2 -> {
          
            System.out.print("Digite um número qualquer: ");
            numDigitado = leia.nextInt();
            for (int i = 0; i < nums.size(); i++) {
                if( nums.get(i).equals(numDigitado)){
                    qtd = qtd + 1;
                    
                    soma = nums.get(i)+ nums.get(i);
                }
                
            }
            System.out.println("quantidade: "+ qtd);
            System.out.println("soma: "+ soma);
                 }


        default -> System.out.println("\nOpção inválida\n"
                  + "Digite novamente\n");
      }

    } while (op > 0);

  
    }
    
}
