package ca.bcit.comp1510.lab11;

import java.util.Scanner;

public class ReverseArray {
    
    public static void swap(int[] data, int leftPos, int rightPos) {
        int tmp = data[leftPos];
        data[leftPos] = data[rightPos];
        data[rightPos] = tmp; 
    }
    
    public static void rev(int[] data) {
        int len = data.length;
        for (int i = 0; i < len/2; i++) { //Indicates array object's halfway point using two divisor.
            swap(data, i, len - i - 1);
        }
    }
    
    public static void printArray(int[] data) {
        int len = data.length; 
        for (int i = 0; i < len; i++) { //Loop condition for Array object conditioned to fit length.
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        @SuppressWarnings("resource") //Scanner object leak suppressed.
        Scanner scan = new Scanner(System.in);
        System.out.print("Please provide the number of array entries to be entered: ");
        int len = scan.nextInt();
        System.out.println();
        int[] arr = new int[len]; //[] delimiter defined by array length.
        for (int entry = 0; entry < len; entry++) {
            System.out.print("Please input an integer array value: ");
            arr[entry] = scan.nextInt();
            System.out.println();
        }
        System.out.println("Array Contents: "); //Print in forward
        printArray(arr);
        rev(arr);
        System.out.println("Reversed Contents: "); //Print in reverse
        printArray(arr);
    }
}
