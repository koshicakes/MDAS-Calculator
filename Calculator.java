import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("---------- CALCULATOR --------");
        System.out.println(" ");

        boolean run = true;

        while (run){
        
        boolean validFirstValue = false;
        double firstValue = 0;

        while (!validFirstValue){

        System.out.print("Enter first Value: ");

        if (scan.hasNextDouble()){
            firstValue = scan.nextDouble();
            validFirstValue = true; // Leaving the validation point and proceed to operator selection

        }
        else{
            System.out.println("Invalid Input!");
            scan.next();
        }
    }
        System.out.print("Operator (+, -, *): ");
        //oprtr ---> operator
        char oprtr = scan.next().charAt(0);

        boolean validFirstValue = false;
        double secondValue = 0;

        while(!validSecondtValue){
        
        System.out.print("Enter Second Value: ");

        if (scan.hasNextDouble()){
            secondValue = scan.nextDouble();
            validSecondtValue = true; // Exit validtaion and solve the problem kapag valid yung operator

        }
        else{
            System.out.println("Invalid Input!");
            scan.next();
        }
    }
        		
		double total = 0;

        switch(oprtr){
            case '+':
                total = firstValue + secondValue;
                break;

        //JOROSS MINUS


            case '*':
                total = firstValue * secondValue;
                 break;

             default:
                System.out.println("Syntax Error! \n" );
                continue;
        }

        System.out.println(firstValue + " "  + oprtr + " " + secondValue + " = " + total );
        boolean choiceValid = false;

        //JOROSS VALIDATING CHOICES


        scan.close();
    }

}