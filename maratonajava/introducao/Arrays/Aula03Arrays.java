public class Aula03Arrays {
    public static void main(String[] args) {
        //int[] numeros = new int[3];
        //outra forma de inicializar
        int[] numeros2 = { 1, 2, 3, 4, 5, };
        //mais uma forma
        //int[] numeros3 = new int[] { 1, 2, 3, 4, 5, };

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }
        //for each
        //não precisa se preocupar com o tamanho do array
        //apenas com o tipo dele, a variavel de referencia precisa ser do mesmo tipo que o array
        for (int i : numeros2) {
            System.out.println(i);
        }
    }
    
}
