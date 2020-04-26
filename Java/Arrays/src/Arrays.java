import java.util.Scanner;

public class Arrays {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int nOfElements;
        System.out.print("Enter size of array: ");
        nOfElements = scanner.nextInt();
        int [] myArray = new int[nOfElements];
        myArray = getIntegers(nOfElements);
        printArray(myArray);
//        sortIntegers(myArray);
//        printArray(myArray);
//        System.out.print("Min element: " + findMin(myArray));
        reverse(myArray);
        printArray(myArray);
    }

    public static int[] getIntegers (int size) {
        int [] array = new int [size];
        System.out.println("Enter " + size + " elements one by one:");
        for (int i =0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray (int [] printArray) {
        System.out.print("List of elements: ");
        for (int i=0; i<printArray.length; i++) {
            System.out.print(printArray[i] + " ");
        }
        System.out.println();
    }

    public static int [] sortIntegers (int [] sortArray) {
        int temp;
        for (int i=1; i<sortArray.length; i++) {
            for (int j=sortArray.length-1; j >= i; j--) {
                if (sortArray[j] > sortArray[j - 1]) {
                    temp = sortArray[j];
                    sortArray[j] = sortArray[j - 1];
                    sortArray[j - 1] = temp;
                }
            }
        }
        return sortArray;
    }

    public static int findMin (int [] array) {
        int min = array[0];
        for (int i=1; i<array.length; i++) {
            if (array[i]<min) {
                min = array [i];
            }
        }
        return min;
    }

    public static void reverse (int [] array) {
        int temp;
        for (int i=0; i < array.length/2; i++) {
            temp = array [i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
    }
}