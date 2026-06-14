//===================================Day 6 (Prefix sum problem)================

import java.util.Scanner;

class Day6 {

    public static void main(String[] args) {
        // problem 1 : given an integer 'a' return the prefix sum/running sum in the
        // same array without creating a new array
        // a= 2,1,3,4,5 output 2,3,6,10,5
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];

        }

        int i = 0;

        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }

    }
}