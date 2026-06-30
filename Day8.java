//========================Day8(transpose of matrix,pascal's traingle)=============

import java.util.Scanner;

class Day8 {
    static void printMatrix(int matrix[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return;
    }

    static int[][] transposeMatrix(int matrix[][], int c, int r) {

        int ans[][] = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[j][i] = matrix[i][j];
            }
        }

        return ans;
    }

    static int[][] transposeinplacematrix(int matrix[][], int c, int r) {
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        return matrix;
    }

    static void pascalsTraingle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row no : ");
        int n = sc.nextInt();
        int mat[][] = new int[n][];
        for (int i = 0; i < n; i++) {
            mat[i] = new int[i + 1];
            mat[i][0] = 1;
            mat[i][i] = 1;

            for (int j = 1; j < i; j++) {

                mat[i][j] = mat[i - 1][j] + mat[i - 1][j - 1];

            }

        }

        printMatrix(mat, n, n);

        return;
    }

    static int[][] rotatematrix(int matrix[][], int r, int c) {
        matrix = transposeMatrix(matrix, c, r);
        
        for (int i = 0; i < r; i++) {

            int left = 0;
            int right = c - 1;

            while (left < right) {

                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;

            }
        }
        

        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row no of matrix ");
        int r = sc.nextInt();
        System.out.println("Enter the Column no of matrix ");
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        System.out.println("Enter matrix " + r * c + " Elements : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                matrix[i][j] = sc.nextInt();

            }
            System.out.println(" ");
        }
        System.out.println("Input matrix");

        printMatrix(matrix, r, c);

        // question 1 : write a program to display transpose matrix entered by the user
        System.out.println("Transpose matrix is : ");
        int ans[][] = transposeMatrix(matrix, c, r);
        printMatrix(ans, c, r);

        // question 2 : transpose array in place without creating new array

        System.out.println("Transpose matrix is : ");
        transposeinplacematrix(matrix, r, c);
        printMatrix(matrix, r, c);

        // question 3 : given an intrger n ,return the first n rows of pascal's traingle
        // ,each nuumber is the sum
        // of the two numbers directly above it as shown for n = 5

        // example figure : if(3,1) => then adding of above element that is 2 + 1 = 3
        // if(4,2) => then adding of above element that is 3 + 3 = 6

        // 0

        // 0 1 //1

        // 1 1 1 //2

        // 2 1 2 1 //3

        // 3 1 3 3 1 //4

        // 4 1 4 6 4 1

        pascalsTraingle();

        // question 4 : rotate the matrix in 90'c degree inb clockwise
        int matrix1[][] = rotatematrix(matrix, r, c);
        System.out.println("Rotated matrix is : ");
        printMatrix(matrix1, r, c);

    }
}