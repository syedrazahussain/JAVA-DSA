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

        // question 2 : For a givem of integer of size in answer queries where you need
        // to print the sum of
        // values in a given range of indices from 1 to r (bothe included) :
        // note : the values of 1 and r in queries follow 1 based indexing
        // arr = 2,4,1,3,6 ==> l =3 and r =5 then ans = 10 beacuse 3 to 5 range is 1+3+6
        // = 10
        System.out.print("Enter the size of the array : ");
        
        
        int pref[] = new int[n];

        System.out.print("Enter Array Elements : ");
        for ( i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        pref[0] = arr[0];

        for ( i = 1; i < arr.length; i++) {
            pref[i] = pref[i - 1] + arr[i];

        }

         i = 0;
        while (i < arr.length) {
            System.out.print(pref[i] + " ");
            i++;
        }
        System.out.println(" ");
        int r = 0, l = 0;
        System.out.println("Enter Range :");
        l = sc.nextInt();
        r = sc.nextInt();
        int sum = 0;
        l= l-1;
        r =r-1;
        
            sum = pref[r] - pref[l - 1];

        
        System.out.println("The sum of : " + sum);

    }
}