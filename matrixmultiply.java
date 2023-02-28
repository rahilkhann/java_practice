import java.util.*;
public class matrixmultiply {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[][] arr1 = {{0,0},{0,0}};
        int[][] arr2 = {{0,0},{0,0}};
        int[][] addarr = {{0,0},{0,0}};

        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr1.length; j++){
                System.out.println("FOR THE FIRST MATRIX");
                System.out.println("Enter the element of "+i+"th row and "+j+"th column: ");
                arr1[i][j] = scan.nextInt();
                
            }
        }

        for(int i = 0; i<arr2.length; i++){
            for(int j = 0; j<arr2.length; j++){
                System.out.println("FOR THE SECOND MATRIX");
                System.out.println("Enter the element of "+i+"th row and "+j+"th column: ");
                arr2[i][j] = scan.nextInt();
                
            }
        }

        for(int i = 0; i<arr2.length; i++){
            for(int j = 0; j<arr2.length; j++){
                addarr[i][j] = arr1[i][0]*arr2[0][j] + arr1[i][1]*arr2[1][j];
            }
        }
        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr1[i].length; j++){
                System.out.print(addarr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }    
}
