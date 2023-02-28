import java.util.*;
public class funcex {

    static float myfunction(int[] numbers){
        int sum = 0;
        float mean;
        float size = numbers.length;
        for(int i = 0; i<numbers.length;i++){
            sum = sum + numbers[i];
        }
        mean = sum/size;
        return mean;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // how to input an array named numbers, with any number of values
        System.out.println("===================");
        System.out.println("  MEAN CALCULATOR  ");
        System.out.println("===================");
        System.out.print("Enter the number of values you want to find the mean of: ");
        int arraylength = scan.nextInt();
        int[] numbers = new int[arraylength];
        for(int i = 0; i<arraylength; i++){
            System.out.println("Enter the "+(i+1)+" th value of the array: ");
            numbers[i] = scan.nextInt(); 
        }



        float mean = myfunction(numbers);
        System.out.println("The mean of the values is: "+mean);

    }
}
