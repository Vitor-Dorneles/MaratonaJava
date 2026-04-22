package maratonajava.POO.IntoducaoMetodos.Dominio;

public class Pessoa {
    private String nome; // só vão ser acessados pelo nosso objeto
    private int idade;

    //métodos de acesso
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
    
}
