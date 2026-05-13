package maratonajava.POO.Heranca.Dominio;

public class Funcionario extends Pessoa{
    // private String nome;
    // private String cpf;
    // private Endereco endereco;
    private double salario;

    public Funcionario(String nome) {
        super(nome);
    }

    public void imprimeDados() {
        super.imprimeDados();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
    System.out.println("Eu:" + this.nome);
 }



    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
        
}
