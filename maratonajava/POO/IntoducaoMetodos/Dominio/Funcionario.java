package maratonajava.POO.IntoducaoMetodos.Dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios = new double[3];
    private double media;

    public void imprime() {
        System.out.println("Os dados do funcionário são: ");
        System.out.println(this.nome + "\tsua idade: " + this.idade);
        System.out.println("Seus ultimos 3 salarios são: ");
        for (double salario : salarios) {
            System.out.println(salario);

        }
        MediaSalarios();
    }
    
    public void MediaSalarios() {
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Media salarial é: " + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double[] getSalarios() {
        return this.salarios;
    }

    // public void setMedia(double media) {
    //     this.media = media;   não deve ser alterada, por isso foi removido
    // }   
    // essa média só deve ser lida por outro programa
    public double getMedia() {
        return this.media;
    }

}

