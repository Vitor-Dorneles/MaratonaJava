package maratonajava.POO.Construtores.Mains;

import maratonajava.POO.Construtores.Dominio.Serie;

public class SerieTest01 {
    public static void main(String[] args) {
        Serie seriado = new Serie("Sopranos", "Máfia", 96, "Ação");
        // seriado.setNome("Sopranos");
        // seriado.setTipo("Máfia");
        // seriado.setEpisodios(96);
        seriado.imprime();
    }
    
}
