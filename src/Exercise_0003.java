/*Imprimir el i-ésimo elemento desde el inicio y desde el final utilizando un solo bucle for*/

public class Exercise_0003 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " - ");
            System.out.println(arr[arr.length - 1 - i]);
        }

    }
}
