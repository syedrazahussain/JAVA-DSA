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

    static int[][] transposeinplacematrix(int matrix[][],int c,int r){
        for(int i = 0; i < r; i++){
            for(int j = i; j < c; j++){
                int temp= matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
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
        // System.out.println("Transpose matrix is : ");
        // int ans[][] = transposeMatrix(matrix, c, r);
        // printMatrix(ans, c, r);

        // question 2 : transpose array in place without creating new array
         System.out.println("Transpose matrix is : ");
        //  int matrix1[][] = transposeMatrix(matrix, c, r);
         transposeinplacematrix(matrix, r, c);
         printMatrix(matrix, r, c);
         
    }
}