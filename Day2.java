//**********************Day -2 (Practise qquestions)***************************

// Question1 : Count the no of occurence of a particular element X consider x=5 and a
//arr=[5,6,5,1,5]

import java.util.Arrays;
import java.util.Scanner;

class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the array size: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // System.out.print("Enter array Elements: ");

        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();

        // }
        // int count = 0;
        // int x = 3;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == x) {
        // count++;

        // }
        // }
        // if (count == 0) {

        // System.out.println("The " + x + " is not found in this array");
        // } else {

        // System.out.println("The count of " + x + " is: " + count);
        // sc.close();
        // }

        // question 2 : find the last occurence of the element x in given array

        // System.out.print("Enter the array size: ");
        // int n1 = sc.nextInt();
        // int[] arr1 = new int[n1];
        // System.out.print("Enter array Elements: ");

        // for (int i = 0; i < arr1.length; i++) {
        // arr1[i] = sc.nextInt();

        // }
        // int x1 = 5;
        // int lastindex = -1;

        // for (int i = 0; i < arr1.length; i++) {
        // if (arr1[i] == x1) {
        // lastindex = i;

        // }
        // }
        // if (lastindex == -1) {
        // System.out.println("ELement not found");
        // } else {
        // System.out.println("Last Occurrence at index: " + lastindex);
        // }

        // // question3 : count the no of element strictly greater thanb value of x
        // System.out.print("Enter the array size: ");
        // int n2 = sc.nextInt();
        // int[] arr2 = new int[n2];
        // System.out.print("Enter array Elements: ");

        // for (int i = 0; i < arr1.length; i++) {
        // arr1[i] = sc.nextInt();

        // }
        // int x2 = 5;

        // int count2 = 0;

        // for (int i = 0; i < arr1.length; i++) {
        // if (arr1[i] > x2) {
        // count2++;
        // }
        // }
        // if (count2 == 0) {
        // System.out.println("ELement not found");
        // } else {
        // System.out.println("Strictly greater than of x is: " + count2);
        // }

        // question 4 :check if the given array is sorted or not?
        // System.out.print("Enter the array size: ");
        // int n3 = sc.nextInt();
        // int[] arr3 = new int[n3];
        // System.out.print("Enter array Elements: ");

        // for (int i = 0; i < arr3.length; i++) {
        //     arr3[i] = sc.nextInt();

        // }
        // boolean isSorted  = true;
        // for (int i = 1; i < arr3.length; i++) {
        //     if(arr3[i] < arr3[i-1]){
        //         isSorted = false;
        //         break;
                
        //     }    
        // }
        // if(isSorted == true){

        //     System.out.println("Array is sorted");
        // }
        // else{

        //     System.out.println("Array is not sorted");
        // }
        

        //question 5 : Return the array of smallest and largest element of the array
        System.out.println("Enter the size of an array: ");
        int n4 = sc.nextInt();
        int arr4 [] = new int[n4];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < arr4.length; i++){
            arr4[i] = sc.nextInt();

        }
        Arrays.sort(arr4);
        for(int i = 0; i < arr4.length; i++){
            System.out.print( arr4[i] + " ");  
           
        }
        System.out.println("The smallest number is : " + arr4[0]);                    
        System.out.println("The largest number is : " + arr4[n4-1]);                    
        


    }
}
