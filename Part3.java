//Code By 4ghOri
//This is a dirty code written in hurry So SOrry
import java.io.*;
import java.lang.Integer;

class Part3 {
    // A Classix bubble sort
    static void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // IF no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }

    // Function to print Repeated elements
    static void printArray(int arr[], int size) {
        int i, j = 0;
        int cmp, temp = 0;
        int res_arr[] = new int[50];
        for (i = 0; i < size; i++) {
            cmp = Integer.compare(arr[i], arr[(i + 3)]);   //kala jaadu
            if (cmp == 0) {
                res_arr[j] = arr[i];
                j++;
                if(arr[i] != temp)
                {
                    System.out.println(arr[i]);
                    temp = arr[i];
                }
              
            }

        }
    }

    // Driver program
    public static void main(String args[]) {
        int arr[] = { 64, 11, 25, 12, 11, 11, 11, 13, 15, 18, 19, 25, 23, 19, 41, 19, 45, 19, 56, 47, 19 };
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Repeated Elements are:");
        printArray(arr, n);
    }
}
