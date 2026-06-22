//=====================(day -7 2d array sum and multiplication problem)=========

import java.util.Scanner;

class Day7 {

    static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }

    static void add(int[][] a, int[][] b, int[][] sum, int r1, int c1, int r2, int c2) {

        System.out.println("Enter the size row of the matrix 1");
        Scanner sc = new Scanner(System.in);
        r1 = sc.nextInt();
        System.out.println("Enter the size columns of the matrix 1");
        c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        System.out.println("Enter" + r1 * c1 + "Elements : ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the size row of the matrix 2");

        r2 = sc.nextInt();
        System.out.println("Enter the size columns of the matrix 2");
        c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];
        System.out.println("Enter" + r2 * c2 + "Elements : ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("The first array is : ");
        printArr(arr1);
        System.out.println("The second array is : ");
        printArr(arr2);
        if (r1 != r2 || c1 != c2) {
            System.out.println("Addition is not possible because dimensions are different.");
            return;
        }

        int sum1[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < sum1[i].length; j++) {
                sum1[i][j] = arr1[i][j] + arr2[i][j];

            }
        }
        System.out.println("The sum of the 2 arrays is : ");
        printArr(sum1);

    }

    public static void main(String[] args) {
        // question 1 : addtion of the 2 matrices
        // note only matrices with same dimension

        add(null, null, null, 0, 0, 0, 0);

    }
}