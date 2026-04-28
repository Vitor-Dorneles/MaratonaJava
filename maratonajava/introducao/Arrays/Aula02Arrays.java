public class Aula02Arrays {
    public static void main(String[] args) {
        // como tipos iniciam
        // byte, short, int, long, float e double O
        // char '\u0000' espaço em branco ' '
        // boolean false
        // String null

        // arrays são como objetos
        String[] nomes = new String[3];
        nomes[0] = "Maria";
        nomes[1] = "Luffy";
        nomes[2] = "josé";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        //nova referencia perde-se a anterior
        nomes = new String[4];
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}