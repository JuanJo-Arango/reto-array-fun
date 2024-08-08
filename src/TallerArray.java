import java.lang.reflect.Array;
import java.util.Arrays;

public class TallerArray {
    public static void main(String[] args) {
        // 1. Declaración e inicialización de un arreglo
        int[] numeros = {5, 2, 8, 1, 9, 3, 7, 4, 6};

        // 2. Imprimir el arreglo original
        System.out.println("Arreglo original:");
        imprimirArreglo(numeros);

        // 3. Encontrar el número mayor
        System.out.println("El numero mayor es: ");
        int mayor = encontrarMayor(numeros);
        System.out.println(mayor);

        // 4. Calcular el promedio
        double promedio = calcularPromedio(numeros);
        System.out.println("El promedio es: " + promedio);

        // 5. Invertir el arreglo
        int[] B=invertirArreglo(numeros);
        System.out.println("Arreglo invertido:");
        imprimirArreglo(B);

        // 6. Ordenar el arreglo (implementa el método ordenarArreglo)
        ordenarArreglo(numeros);
        System.out.println("Arreglo ordenado:");
        imprimirArreglo(numeros);
    }

    // Método para imprimir el arreglo
    public static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Método para encontrar el número mayor
    public static int encontrarMayor(int[] arr) {
        // Implementa este método
        int mayor=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>mayor) {
                mayor=arr[i];
            }
        }
        return mayor;   
        }
            

    // Método para calcular el promedio
    public static double calcularPromedio(int[] arr) {
        // Implementa este método
        double suma=0;
        double promedio;

        for (int k = 0; k < arr.length; k++) {
            suma +=arr[k];
        }
        promedio=suma/ arr.length;
        return promedio;
}
        
    

    // Método para invertir el arreglo
    public static int[] invertirArreglo(int[] arr) {
        // Implementa este método
        int[]  B=new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
        B[i] = arr[arr.length -1 -i];
        }
    return B;
    }

    
    
    

    // Método para ordenar el arreglo (puedes usar el algoritmo de burbuja)
    public static void ordenarArreglo(int[] arr) {
        // Implementa este método
        Arrays.sort(arr);
    }
}