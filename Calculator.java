import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("---------- CALCULATOR --------");
        System.out.println(" ");

        boolean run = true;
		// Calculator Run
        while (run){
        
        boolean validFirstValue = false;
        double firstValue = 0;
			
		// Validating First Value
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

		// Validating Second Value
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
            case '-':
                total = firstValue - secondValue;
                break;
            case '*':
                total = firstValue * secondValue;
                break;
            default:
                System.out.println("Syntax Error! \n" );
                continue;
        }

        System.out.println(firstValue + " "  + oprtr + " " + secondValue + " = " + total );
        boolean choiceValid = false;

        // Validating choices     
       while(!choiceValid){
       System.out.print("Continue?(yes/no): ");
       String choice = scan.next();
       System.out.println(" ");
       
       if(choice.equalsIgnoreCase("no")){
           choiceValid = true;//exit validating loop
           run = false; //exit in the main loop and shutdown the calculator
     } else if(choice.equalsIgnoreCase("yes")){
           choiceValid = true; //exit validating loop
           run = true; //continue to the main loop
     } else{
           System.out.println("Invalid Option!\n");
     }
    } 
   } 
        scan.close();
    }
}
