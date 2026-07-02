//=========================Day10(prefix sum of array sum of rectangle)=============

import java.util.Scanner;

class Day10 {

    static int printSumRectangle(int matrix[][], int r1, int c1, int r2, int c2, int r, int c) {
        
        int sum = 0;
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;

    }

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
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The sum of the rectangle of array is "
                            +printSumRectangle(matrix, r1, c1, r2, c2, r2, c2));
        
    }
}
