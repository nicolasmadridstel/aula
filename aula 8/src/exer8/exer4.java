/*
 */
package exer8;

import java.util.Scanner;

/**

 */
public class exer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);

        int meiaVida = 0;
        double gramas = 0;
        double segundos = 0, minutos = 0, horas = 0;

        System.out.println("Digite o valor inicial do material: ");
        gramas = ler.nextDouble();

        while (gramas > 0.5) {
            gramas /= 2;
            meiaVida++;
        }

        segundos = meiaVida * 50;
        minutos = segundos / 60;
        horas = minutos / 60;

        System.out.println("Tempo gasto para atingir um valor menor que 0,5g \n"
                + segundos + " Segundos" + "\n"
                + minutos + " Minutos" + "\n"
                + horas + " horas");
    }
    
}
