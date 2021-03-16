/*
.
 */
package aula6;

import java.util.Scanner;


public class programalivro {

    
    public static void main(String[] args) {
       Scanner ler = new Scanner (System.in);

        cliente cl = new cliente();

        System.out.println("Digite seu nome:");
        cl.nome = ler.nextLine();

        System.out.println("Digite sua idade:");
        cl.idade = ler.nextInt();

        System.out.println("Digite seu  livro:");
        cl.setPreferencia(ler.nextLine());
     

        System.out.println(cl);
        System.out.println("Verifiquei os dados " + cl.verificarIdade());



        livro l1 = new livro();

        System.out.println("Digite o Titulo do Livro:");
        l1.titulo = ler.nextLine();

        System.out.println("Digite o Autor:");
        l1.autor = ler.nextLine();

        System.out.println("Digite o ano do livro:");
        l1.ano = ler.nextInt();

        System.out.println("Digite o genero do livro:");
        l1.setGenero(ler.nextLine());

        System.out.println("Digite o preço do livro:");
        l1.setPreco(ler.nextDouble());



        System.out.println(l1);
        System.out.println("analisando" + l1.verificarPreco());

        System.out.println(l1);
        System.out.println(l1.verificarPreco2() + "o desconto é de");
    }
    }
    

