import java.util.*;

public class arrays {
    public static void main(String[] args) {
        
        // int[] thisarray = {1,2,3,4,5};
        // for(int i = 0; i<= thisarray.length; i++){
        //     System.out.println(thisarray[i]);
        // }

        // for (int i : thisarray) {
        //     System.out.println(i);
            
        // }

        // declaring array
        // int[] thatarray = new int[5]; //we are creating an integer array that can store upto 5 int values
        // thatarray[2] = 100;
        // thatarray[4] = 1;
        // for (int i : thatarray) {
        //     System.out.println(i);
            
        // }

        // thatarray[7] = 1; //will give error and program exits

        // Scanner scan = new Scanner(System.in);
        // for(int i =0;i<thatarray.length; i++){
        //     System.out.println("Enter value for : "+i+"th element in Array: ");
        //     thatarray[i] = Integer.parseInt(scan.nextLine());
        // }

        // for (int i : thatarray) {
        //     System.out.print("The array is as follows: "+i+" ");
        // }

        //QUESTION:

        //Ask the user to enter 'n', where n is the length of the array
        //collect inputs
        //display

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in the array: ");
        
        int n = Integer.parseInt(scan.nextLine());
        int[] userarray = new int[n];
        int continueloop;
        int i = 0;
        if(i==n){
            do{
                i = i+1;
                System.out.println("Enter the element: ");
                userarray[i] = Integer.parseInt(scan.nextLine());
                System.out.println("Do you want to continue? Press 0 to continue");
                continueloop = Integer.parseInt(scan.nextLine());

            }while(continueloop == 0); 
        System.out.println(Arrays.toString(userarray));
        }


    }
}
