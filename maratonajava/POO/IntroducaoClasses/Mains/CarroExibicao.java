package maratonajava.POO.IntroducaoClasses.Mains;

import maratonajava.POO.IntroducaoClasses.Dominio.Carro;

public class CarroExibicao {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Fiat";
        carro1.ano = "2005";
        carro1.modelo = "strada";


        Carro carro2 = new Carro();
        carro2.ano = "2010";
        carro2.nome = "Fiat Stilo";
        carro2.modelo = "Hatch";

        System.out.println("Nome:" + carro1.nome + " Modelo:" + carro1.modelo + " ano:" + carro1.ano);
        System.out.println("Nome:" + carro2.nome + " Modelo:" + carro2.modelo + " ano:" + carro2.ano);
    }
    
}
