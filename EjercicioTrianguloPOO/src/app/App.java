package app;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-7: Dado un triángulo representado por sus lados L1, L2, L3, determinar
         * e imprimir una leyenda según sea: equilátero, isósceles o escaleno.
         */

        Triangulo triangulo = new Triangulo(1, 5, 3);

        triangulo.decirTipo();

    }
}