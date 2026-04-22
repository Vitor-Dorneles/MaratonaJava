package maratonajava.POO.IntroducaoClasses.Mains;

import maratonajava.POO.IntroducaoClasses.Dominio.Pessoa; //import necessário

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa estudante = new Pessoa(); //criação do objeto, do tipo "Pessoa", "estudante" serve para referenciar e ser a variavel de referencia para este novo objeto
        estudante.nome = "Vitor";
        estudante.idade = 21;
        estudante.sexo = "M";

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);


        
    }
    
    
    
    


}
