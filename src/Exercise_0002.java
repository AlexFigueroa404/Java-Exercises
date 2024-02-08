
//Imprimir los elementos de un arreglo en orden descendente
public class Exercise_0002 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[arr.length - 1 - i] + ",");
        }


        System.out.println("\n---------------------");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.printf(arr[i] + ",");
        }
    }
}
