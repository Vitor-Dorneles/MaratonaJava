package maratonajava.POO.IntoducaoMetodos.Mains;

import maratonajava.POO.IntoducaoMetodos.Dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        // pessoa.nome = "Vitor";
        // pessoa.idade = 21;
        pessoa.setNome("Vitor");
        pessoa.setIdade(21);

        pessoa.imprime();

        //System.out.println(pessoa.getNome());
        //System.out.println(pessoa.getIdade());
    }
    
}
