import java.util.Scanner;

class Day9 {

    static void printmatrix(int matrix[][],int r,int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printspiral(int matrix[][], int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalElement = 0;
        while (totalElement < r * c) {
            // topRow => leftCol to rightCol
            for (int j = leftCol; j <= rightCol && totalElement < r * c; j++) {
                System.out.print(matrix[topRow][j] + " ");
                totalElement++;

            }
            topRow++;

            // rightCol => topRow+1 to bottomRow
            for (int i = topRow; i <= bottomRow && totalElement < r * c; i++) {
                System.out.print(matrix[i][rightCol] + " ");
                totalElement++;
            }
            rightCol--;

            // bottomRow => rightCol-1 to leftCol
            for (int j = rightCol; j >= leftCol && totalElement < r * c; j--) {
                System.out.print(matrix[bottomRow][j] + " ");
                totalElement++;
            }
            bottomRow--;

            // leftCol => bottomRow-1 to topRow+1
            for (int i = bottomRow; i >= topRow && totalElement < r * c; i--) {
                System.out.print(matrix[i][leftCol] + " ");
                totalElement++;
            }
            leftCol++;
        }

    }

    static int[][] generatespiralmatrix(int n){
        int matrix[][] = new int[n][n];
          int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int curr = 1;
        while (curr <= n * n) {
            // topRow => leftCol to rightCol
            for (int j = leftCol; j <= rightCol && curr <= n * n; j++) {
                matrix[topRow][j] = curr++;
                

            }
            topRow++;

            // rightCol => topRow+1 to bottomRow
            for (int i = topRow; i <= bottomRow && curr <= n * n; i++) {
                matrix[i][rightCol] =curr++;
            }
            rightCol--;

            // bottomRow => rightCol-1 to leftCol
            for (int j = rightCol; j >= leftCol && curr <= n * n; j--) {
                matrix[bottomRow][j] = curr++;
            }
            bottomRow--;

            // leftCol => bottomRow-1 to topRow+1
            for (int i = bottomRow; i >= topRow && curr <= n * n; i--) {
                matrix[i][leftCol] = curr++;
            }
            leftCol++;
        }


        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter no of columns : ");
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        System.out.println("Enter " +r*c+ " Elements : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Input matrix is : ");
        printmatrix(matrix,r,c);



        // question 1 : Return all the elements of the matrix in spiral order
        // Ex : 1,2,3,6,9,8,7,4,5
        System.out.println("Spiral order of the matrix is : ");
        printspiral(matrix, r, c);

        //question 2 : Generate spiral matrix when user gives n=5 the 5*5 in spriral matrix should generate
        System.out.println("Enter n value : ");
        int n = sc.nextInt();
        System.out.println("Generated spiral matrix : ");
        int matrix1[][] = generatespiralmatrix(n);
        printmatrix(matrix1, n, n);


       

    }
}