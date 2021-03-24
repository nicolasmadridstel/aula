/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class exer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<Integer> listaNumerosDigitados = new ArrayList();

        System.out.println("Digite quantos numeros você quiser ! \n"
                + "Para parar digite um numero negativo ! \n"
                + "Ex.: -5 \n");
        int numero = 0;

        do {
            System.out.println("Digite um numero: ");
            numero = ler.nextInt();
            listaNumerosDigitados.add(numero);

        } while (numero >= 0);

        int ultimoNumero = listaNumerosDigitados.size();
        listaNumerosDigitados.remove(ultimoNumero -1);

        System.out.println("Os numeros digitados: \n"
                + listaNumerosDigitados);

        int somaNumeros = 0;
        for (int n : listaNumerosDigitados) {
            somaNumeros += n;
        }

        System.out.println("A soma dos numeros digitados: \n"
                + somaNumeros);

        System.out.println("A quantidade de numeros digitados é: \n"
                + listaNumerosDigitados.size());

        int mediaNumeros = 0;
        for (int n : listaNumerosDigitados) {
            mediaNumeros = somaNumeros / listaNumerosDigitados.size();
        }

        System.out.println("A média dos numeros digitados é: \n"
                + mediaNumeros);

    }
    
}
