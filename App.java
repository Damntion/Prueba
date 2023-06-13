public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int[] ArrayNumeros = new int[] { 5, 4, 7, 1, 2, 0 };
        int[] Array = ordenarNumeros(ArrayNumeros); // hemos cambiado el nombre de las variables para que sean mas descriptivas
                                        // puesto que los anteriores nombre no tenian sentido

        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i] + " ");
        }
    }

    private static int[] ordenarNumeros(int[] numero) {
        // Este bucle exterior recorre el Array desde el principio hasta el penúltimo
        // elemento. Cada iteración coloca el elemento más grande en su posición final.
        for (int i = 0; i < numero.length; i++) {
            // El bucle interior compara elementos adyacentes y los intercambia si están en
            // el orden incorrecto.
            // Cada iteración coloca el elemento más grande en la posición correcta al final
            // del subArray no ordenado.
            for (int j = 0; j < numero.length - i - 1; j++) {
                if (numero[j] > numero[j + 1]) {
                    // Si el elemento actual es mayor que el siguiente, se intercambian sus
                    // posiciones.
                    int t = numero[j + 1];
                    numero[j + 1] = numero[j];
                    numero[j] = t;
                }
            }
        }
        // Devuelve el Array ordenado.
        return numero;
    }
}
