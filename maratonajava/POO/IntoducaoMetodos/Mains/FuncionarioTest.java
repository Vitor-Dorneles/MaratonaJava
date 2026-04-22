package maratonajava.POO.IntoducaoMetodos.Mains;

import java.util.Scanner;

import maratonajava.POO.IntoducaoMetodos.Dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Scanner teclado = new Scanner(System.in);

        funcionario.setNome(teclado.nextLine()); 
        funcionario.setIdade(teclado.nextInt()); 
        for (int i = 0; i < funcionario.getSalarios().length; i++) {
            funcionario.getSalarios()[i] = teclado.nextDouble();
        }
        funcionario.imprime();

        teclado.close();
    }
    
}
