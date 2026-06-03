//*********************Day -1 (Array In Java)***************************

class Day1{
    public static void main(String args[]){
        //initialisation of an array of single dimensional array
        int[] arr = new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //initialisation of 2d array
        int[][] multiarr = new int[2][3];
        multiarr[0][0]=1;
        multiarr[0][1]=13;
        System.out.println(multiarr[0][1]);

        //length of array

        System.out.println(multiarr.length);

        //Question1:Calculate the sum of all elements in given array
        int[] arr_s = {1,4,56,7,8};
        int sum=0;
        for (int i = 0 ; i<arr_s.length; i++){
            sum = sum + arr_s[i];
        }
        System.out.println(sum);

        //Question2: find the value of maximum element in array

        int arr1[] = {10,20,30,40,50,70,44};
        int ans1=0;
        for(int i = 0; i<arr1.length;i++){
            if(arr1[i]>ans1){
                ans1=arr1[i];
            }
        }
        System.out.println(ans1);

        //question3 search the given element x in the array if present then rerturn 1 then else return -1
        int[] arr_search = {10,20,30,40,50,60,77,20,55};
        int x=20;
        int ans2 = -1;
        for(int i =0;i<arr_search.length;i++){
            if(arr_search[i]==x){
                ans2=i;
                break;
            }
        }
        if (ans2== -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("found " + x + " at index " + ans2);
        }


        
    }
}
