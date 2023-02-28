import java.util.*;
public class matrix_add {
    public static void main(String[] args) {
        
        // int[][] arr1 = {{1,2},{5,6}};
        // int[][] arr2 = {{9,8},{5,4}};
        // int[][] addarr = {{0,0}, {0,0}};

        // for(int i = 0; i<arr1.length; i++){
        //     for(int j = 0; j<arr1.length; j++){
        //         addarr[i][j] = arr1[i][j] + arr2[i][j];
        //     }


        // }
        

        // for(int i = 0; i<addarr.length; i++){
        //     for(int j = 0; j<addarr[i].length; j++){
        //         System.out.print(addarr[i][j] + " ");
        //     }
        //     System.out.println(" ");
        // }

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
                addarr[i][j] = arr1[i][j] + arr2[i][j];
                
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