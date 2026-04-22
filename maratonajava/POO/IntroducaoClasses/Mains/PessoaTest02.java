package maratonajava.POO.IntroducaoClasses.Mains;

import maratonajava.POO.IntroducaoClasses.Dominio.Pessoa;

public class PessoaTest02 {
    public static void main(String[] args) {
        Pessoa aluno = new Pessoa();
        Pessoa aluno02 = new Pessoa();
        aluno.nome = "Emilly";
        aluno02.nome = "Bete";

        System.out.println(aluno.nome);
        System.out.println(aluno02.nome);
    }
    
}
