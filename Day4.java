//=============================Day4 practise question with array ==================================

import java.util.Scanner;

class Day4 {
    public static void main(String[] args) {
        // question 1 : swap the no with temp variable a=9,b=3

        // int a = 9;
        // int b = 3;

        // System.out.println("The A values before swapping is : A = " + a);
        // System.out.println("The B values before swapping is : B = " + b);
        // System.out.println("");

        // int temp = a;
        // a = b;
        // b = temp;
        // System.out.println("The A values After swapping is : A = " + a);
        // System.out.println("The B values After swapping is : B = " + b);

        // // question 2: given 2 integer a and b swap the 2 given values using
        // // sums and diff method without temp variable

        // int a1 = 10;
        // int b1 = 20;

        // a1 = a1 + b1;
        // b1 = a1 - b1;
        // a1 = a1 - b1;

        // System.out.println("A = " + a1);
        // System.out.println("B = " + b1);

        // question 3: Reverse an array consisting of integer value
        // 1,2,3,4,5 -----> 5,4,3,2,1
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of the array");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter array elemnents: ");
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // for (int i = 0; i < n/2; i++) {
            
        //         int temp1 = arr[i];
        //         arr[i] = arr[n-1-i];
        //         arr[n-1-i] = temp1;
                
            
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
            
        // }

        //question 4 : Check if the given number is present in the array or not
        // Note : Value of all elements in the array is less than 10 to the power 5
                    //arr = 5,6,5,400,560,1000,400 if user enters 400 -> yes if 4 -> no

        
        System.out.println("Enter the size of the array");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        int ans[] = new int[n1];
        System.out.println("Enter array elemnents: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Ente the target values : ");
        for (int i = 0; i < arr1.length; i++) {
            ans[i] = sc.nextInt();
          

        }
for (int i = 0; i < arr1.length; i++) {
          while(i<arr1.length) {
                if(arr1[i] == ans[i]) {
                System.out.println(arr1[i]  + " Yes");
            }
            else {
                System.out.println(arr1[i] + " No");
            }
        }
    
        

        

    }
}
}