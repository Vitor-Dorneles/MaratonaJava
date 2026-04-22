package maratonajava.POO.IntoducaoMetodos.Dominio;

public class Calculadora {

    public void SomaDoisNumeros() {
        System.out.println(10 + 87);
    }
    
    public void SubtraiDoisNumeros() {
        System.out.println(97 - 10);
    }

    public void MultiplicaDoisNumeros(int numero01, int numero02) {
        System.out.println(numero01 * numero02);
    }

    public double divisao(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return (num1 / num2);
    }

    
}
