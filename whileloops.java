
import java.util.*;
class whileloops{
    public static void main(String[] args) {

        // int a = 5;
        // while(a<=5){
        //     System.out.println(a);
        //     a-=1;
        // }
        Scanner scan = new Scanner(System.in);
        // char ch;

        // do{
        //     System.out.println("Executing...");
        //     System.out.println("To continue y: ");
        //     ch = scan.nextLine().charAt(0);
        // }while(ch == 'y' || ch =='Y');
        //     System.out.println("Program End");
        
        System.out.println("Choose an operation: \n")
        System.out.println("1. Add")
        System.out.println("2. Subtract")
        System.out.println("3. Multiply")
        System.out.println("4. Divide")

        operation = scan.nextInt();
        System.out.print("Now, choose the first input: ");
        input1 = scan.nextInt();
        System.out.print("Now, choose the second input: ");
        input2 = scan.nextInt
        
        
        switch(operation){
            case "1":
                System.out.println(input1+input2);
                break;
            case "2":
                System.out.println(input1-input2);
                break;
            case "3":
                System.out.println(input1*input2);
                break;
            case "4":
                System.out.println(float(float(input1)/float(input2)));
                break;
        }

        
    }
    

}
