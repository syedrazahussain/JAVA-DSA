//**********************Day -2 (Practise qquestions)***************************

// Question1 : Count the no of occurence of a particular element X consider x=5 and a
        //arr=[5,6,5,1,5]

import java.util.Scanner;

class Day2{
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          
          System.out.print("Enter the array size: ");
          int n = sc.nextInt();
          int [] arr = new int[n];
            System.out.print("Enter array Elements: ");
        
            for(int i = 0; i < arr.length; i++ ){
               arr[i]= sc.nextInt();
                

            }
            int count = 0;
            int x = 3;
            for(int i = 0; i < arr.length; i++ ){
                if(arr[i]==x){
                    count++;

                }  
            }
            if(count==0){

                System.out.println("The "+ x + " is not found in this array");
            }else {

                System.out.println("The count of " + x + " is: " + count);
                sc.close();
            }
            
            




        
    }
}
