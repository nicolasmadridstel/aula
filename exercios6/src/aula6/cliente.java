/*

 */
package aula6;


public class cliente {
     public String nome;
    public int idade;
    private String preferencia;

    public cliente(String nome, int idade, String preferencia) {
        this.nome = nome;
        this.idade = idade;
        this.preferencia = preferencia;
    }
public cliente() {

}
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }

    public String verificarIdade() {
        String resposta;
        if (idade >= 18) {
            resposta = "maior de idade";
        }else {
            resposta = "menor de idade";
        }
        return resposta;
         }

    @Override
    public String toString() {
        return "Dados do Cliente" + "\n"
                + "O nome do Cliente é:" + this.nome + "\n"
                + "A idade do Cliente é:" + this.idade + "\n"
                + "A preferência do Cliente é:" + this.preferencia;
    }
}
