/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class desafio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leia = new Scanner(System.in);
    int[] numeros = new int[20];
    int pares=0, impares=0;

     for (int i = 0; i < numeros.length; i++) {
      numeros[i] = i+1;
     if(numeros[i]%2 ==0){
       pares++;
     }else{
     impares++;
     }
    }
        String String = Arrays.toString(numeros); /*toString*/
     System.out.println( Arrays.toString(numeros));

     System.out.println("Quantidade de impares: " + impares);
     System.out.println("Quantidade de pares: " + pares);

  }
    }
    

