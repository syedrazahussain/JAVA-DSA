//======================Day 11 (Array List) ================================

import java.util.ArrayList;
import java.util.Collections;


class Day11 {

    static void reverseArraylist(ArrayList<Integer> l1) {

        int i = 0;
        int j = l1.size() - 1;
        while (i < j) {

            Integer temp = Integer.valueOf(l1.get(i));
            l1.set(i, l1.get(j));
            l1.set(j, temp);

            i++;
            j--;
        }

    }
       

    public static void main(String[] args) {

        // initialising the array list
        ArrayList<Integer> l1 = new ArrayList<>();

        // adding elements
        l1.add(12);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        l1.add(20);

        // // getting an element at index number
        // System.out.println(l1.get(0));

        // // print with for loop
        // for (int i = 0; i < l1.size(); i++) {
        // System.out.println(l1.get(i));
        // }

        // // print without loop
        // System.out.println(l1);

        // // adding element removing modyfing
        // l1.add(1, 100);
        // System.out.println(l1); // [5,100,6,7,8,9,20]

        // // modying
        // l1.set(0, 200);
        // System.out.println(l1);

        // // removing element
        // l1.remove(1);
        // System.out.println(l1);

        // // removing element e (unknown index)
        // l1.remove(Integer.valueOf(7));
        // System.out.println(l1);

        // // checking if an element exist
        // boolean ans = l1.contains(Integer.valueOf(6));
        // System.out.println(ans);

        // // if you don't specify class , you can put anything inside l

        // ArrayList l = new ArrayList();
        // l.add("Hello");
        // l.add(2);
        // l.add(2.5);
        // System.out.println(l);

        // question 1 : Reverse the array list

        System.out.println("Original Array list : ");
        System.out.println(l1);
        
        reverseArraylist(l1);
        System.out.println("Reversed Array List : " + l1);
        Collections.reverse(l1);

        //question 2 : Sort array list strings in descending
        Collections.sort(l1);
        System.out.println("Ascending order " + l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("Des" +l1);

      
    }
}