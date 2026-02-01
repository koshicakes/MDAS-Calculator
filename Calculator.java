import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("---------- CALCULATOR --------");
        System.out.println(" ");

        System.out.print("Enter first Value: ");
        double firstValue = scan.nextDouble();

        System.out.print("Operator (+, -, *): ");
        //oprtr ---> operator
        char oprtr = scan.next().charAt(0);
        
        System.out.print("Enter Second Value: ");
        double secondValue = scan.nextDouble();
		
		double total = 0;
        switch(oprtr){
            case '+':
                total = firstValue + secondValue;
                break;
            default:
                System.out.println("Invalid Operator! Please choose in the given option.")
                return;
        }

        System.out.println(firstValue + " "  + oprtr + " " + secondValue + " = " + total );
        scan.close();
    }

}