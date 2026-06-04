//**********************Day -3 (Practise qquestions)***************************

import java.util.Scanner;

class Day3 {
    public static void main(String[] args) {

        // ================ 1. Target sum ==========================================

        // question1 : find the total no of pairs in the array whose sum is equal to the
        // given value of x
       // arr = 4,6,3,5,8,2 and target =7 ans =2

         Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter Target Element: ");
        int target = sc.nextInt();
        int ans =0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == target) {
                    ans++;
                    
                }
            }
        }
        // System.out.println(ans);

        //question 2 : count the no of triplets whose sum is equal to the given value of x
                        //arr=1,4,5,6,3 and target = 12 ans =2 

        System.out.print("Enter the Size of the array: ");
        int n1 = sc.nextInt();
        int arr1 [] = new int[n1];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();

        }
        System.out.println("Enter the target element: ");
        int target1 = sc.nextInt();
        int ans1 = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j < arr1.length; j++) {
                for (int k = i+2; k < arr1.length; k++){
                    if(arr1[i] + arr1[j] + arr1[k] == target1){
                        ans1++;
                    }
                }
            }
        }
        System.out.println(ans1);

        // ===================== 2.Array manipulation ====================================

        //question 2.1 : find the unique no in a given array where all the elements 
        // are being repeated twice with the values being unique
        // arr = 1,2,3,4,2,1,3   ans = 4

        System.out.print("Enter size of the array: ");
        int n2 = sc.nextInt();
        int arr2 [] = new int[n2];
        System.out.print("Enter array Elements: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int ans2=-1;
        for(int i = 0; i < arr2.length; i++) {
            for(int j = i+1; j < arr2.length; j++) {
                if(arr2[i] == arr2[j]) {
                    arr2[i] =-1;
                    arr2[j] =-1;
                    
                }
            }
        }
        
            for(int i = 0; i < arr2.length; i++) {
                if(arr2[i] > 0) {
                    ans2 = arr2[i];
                }
            }
            System.out.println("The unique number in array is : " + ans2);
        
        




        


        

    }
}