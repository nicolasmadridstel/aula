/*
r.
 */
package aula4;

import java.util.Scanner;


public class maincliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner ler = new Scanner(System.in);
      cliente c1 = new cliente();
      
      System.out.println("Nome do cliente");
      c1.SetNome(ler.nextLine());
      
      System.out.println("Digete a idade");
      c1.setIdade(ler.nextInt());
      
      System.out.println("Digete o salário do cliente");
      c1.setRenda(ler.nextDouble());
      //invocando os getters
      System.out.println(c1.getNome());
      System.out.println(c1.getIdade());
      System.out.println(c1.getRenda());
      //chamar os métodos criados
      System.out.println(c1.cassificarIdade());
      System.out.println(c1.classifiacarRenda());
      
    }
    
    
}
