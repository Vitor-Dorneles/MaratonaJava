package maratonajava.POO.SobrecargaMetodos.Mains;

import maratonajava.POO.SobrecargaMetodos.Dominio.Serie;

public class SerieTest01 {
    public static void main(String[] args) {
        Serie seriado = new Serie(); //os parenteses aqui representam o construtor
        seriado.setNome("Sopranos");
        seriado.setTipo("Máfia");
        seriado.setEpisodios(96);
        seriado.imprime();
    }
    
}
