package maratonajava.POO.Heranca.Mains;

import maratonajava.POO.Heranca.Dominio.Endereco;
import maratonajava.POO.Heranca.Dominio.Funcionario;
import maratonajava.POO.Heranca.Dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 03");
        endereco.setCep("123");

        Pessoa pessoa = new Pessoa("Vitor");
        pessoa.setCpf("4587");
        pessoa.setEndereco(endereco);

        pessoa.imprimeDados();

        Funcionario funcionario = new Funcionario("XUXA");
        funcionario.setCpf("222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(4555);
        System.out.println("--------"); 
        funcionario.imprimeDados();

    }
    
}
