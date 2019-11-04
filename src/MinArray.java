import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        int[] array = {1,3,12,4,6,18,25,5};
        int index = minValue(array);
        System.out.println("The smallest element in the array is: " + array[index]);
    }

    public static int minValue(int []array) {
        int min = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }

        return index;
    }
 }
