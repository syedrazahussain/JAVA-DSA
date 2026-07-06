//=========================Day10(prefix sum of array sum of rectangle)=============

import java.util.Scanner;

class Day10 {
    static void printmatrix(int matrix[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int printSumRectangle(int matrix[][], int r1, int c1, int r2, int c2, int r, int c) {

        int sum = 0;
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;

    }

    // static int[][] prefixSum(int matrix[][], int r, int c) {

    //     for (int i = 0; i < r; i++) {
    //         for (int j = 1; j < c; j++) {
    //             matrix[i][j] += matrix[i][j - 1];

    //         }

    //     }

    //     return matrix;
    // }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Rows of matrix : ");
        int r = sc.nextInt();
        System.out.println("Enter No of Columns of matrix : ");
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        System.out.println("Enter Matrix Elements : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter Boundaries for (R1,c1) : ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter Boundaries for (R2,c2) : ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        System.out.println("The input matrix is : ");
        printmatrix(matrix, r, c);

        // question 1 ; for a given matrix 'a' of dimension n x m and 2 coordinates
        // (l1,r1) and (l2,c2) return the
        // sum of the rectangle from (l1,r1) and (l2,r2)

        System.out.println("The sum of the rectangle of array is "
                + printSumRectangle(matrix, r1, c1, r2, c2, r2, c2));

        // int matrix1[][] = prefixSum(matrix, r, c);
        // printmatrix(matrix1, r, c);

    }
}
