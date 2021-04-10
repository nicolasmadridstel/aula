
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicol
 */
public class animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);

        Cachorro c1 = new Cachorro();
        Papagaio p1 = new Papagaio();
        Mosca m1 = new Mosca();

        String especie, cor;

        System.out.println("Digite a cor do pelo do cachorro: ");
        c1.setCorPelo(ler.nextLine());
        System.out.println("O dogui é: "+ c1.getCorPelo());

        System.out.println("Digite a cor da pena do papagaio: ");
        p1.setCorPena(ler.nextLine());
        System.out.println("O dogui é: "+ p1.getCorPena());

        System.out.println("Digite a quantidade de patas da mosca: ");
        m1.setQtdPatas(ler.nextInt());
        System.out.println("O doguinho é: "+ m1.getQtdPatas());
    }
    }
    

