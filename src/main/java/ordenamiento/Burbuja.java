/*
 * Alumno: Angel Josue Domingo Guillen
 * Grupo: 4 C
 * Matricula: 20251011
 *
 * Practica: Metodo de ordenamiento burbuja (tradicional y mejorado)
 */
package ordenamiento;

import java.util.Arrays;

/**
 *
 * @author Angel Josue Domingo Guillen
 */
public class Burbuja {

    public static void ordenamientoBurbuja(int[] arreglo) {
        int n = arreglo.length;
        int pasadas = 0;

        for (int i = 0; i < n - 1; i++) {
            pasadas++;
            for (int j = 0; j < n - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }

        System.out.println("Pasadas realizadas: " + pasadas);
    }

    public static void ordenamientoBurbujaMejorado(int[] arreglo) {
        int n = arreglo.length;
        int pasadas = 0;

        for (int i = 0; i < n - 1; i++) {
            pasadas++;
            boolean huboIntercambio = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    huboIntercambio = true;
                }
            }

            if (!huboIntercambio) {
                break;
            }
        }

        System.out.println("Pasadas realizadas: " + pasadas);
    }

    public static void main(String[] args) {
        System.out.println("Angel Josue Domingo Guillen  4 C 20251011");

        int[] datosOriginales = {1, 2, 3, 5, 4, 6, 7, 8};
        System.out.println("Arreglo original: " + Arrays.toString(datosOriginales));

        int[] prueba1 = datosOriginales.clone();
        int[] prueba2 = datosOriginales.clone();

        System.out.println("\nBurbuja tradicional");
        ordenamientoBurbuja(prueba1);
        System.out.println("Resultado: " + Arrays.toString(prueba1));

        System.out.println("\nBurbuja mejorada");
        ordenamientoBurbujaMejorado(prueba2);
        System.out.println("Resultado: " + Arrays.toString(prueba2));
    }
}
