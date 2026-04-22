package maratonajava.POO.IntoducaoMetodos.Mains;

import maratonajava.POO.IntoducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.MultiplicaDoisNumeros(10, 20);

        //double valor = calculadora.divisao(45, 5);
        //System.out.println("Valor de resultado é: " + valor);
        System.out.println(calculadora.divisao(45, 5));

    }
    
    
}
