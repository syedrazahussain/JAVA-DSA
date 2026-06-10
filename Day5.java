//=============================Day 5 (Two Pointer realated problems)

import java.util.Scanner;

class Day5 {

     // Question 1 : Sort an array consisting of array 0s and 1s
    // arr = 1,0,0,1,0,1,1,0,0  ==> 0,0,0,0,0,1,1,1,1

    static void printArray(int[] arr) {
       int n = arr.length;
       for (int i =0; i < n; i++) {
        System.out.println(arr[i] + " ");
       }
       System.out.println();
    }

    static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j] ;
        arr[j] = temp;
    }

    static void sortzeroesAndOnes(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(left<right) {
            if(arr[left]==1 && arr[right] ==0)  {
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left] == 0) {
                left++;
            }
            if(arr[right] == 1) {
                right--;
            }

        }
    }

    //question 2 : Given an array of integer 'a', mmove  all the even integer at the begining of 
    // the array followed by all the add integer. the relative order of odd or even integer does 
    // not matter return an array that satisfy the cond

    //arr = 1,2,3,4,5,6,7 ==> 2,4,6,1,3,5,7

    static void printevenOddarray(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left <right) {
            if(arr[left]%2 == 1 && arr[right]%2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]%2 == 0){
                left++;
            }
            if(arr[right]%2 == 1) {
                right--;
            }
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+n+"array: ");
        for(int i = 0; i <n;i++) {
            arr[i] = sc.nextInt();
        }
    // Question 1 : Sort an array consisting of array 0s and 1s
    // arr = 1,0,0,1,0,1,1,0,0  ==> 0,0,0,0,0,1,1,1,1

    System.out.println("Oreiginal array");
    printArray(arr);
    printevenOddarray(arr);
    // sortzeroesAndOnes(arr);
    System.out.println("Sorted array");
    printArray(arr);


    



    }
}