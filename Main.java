package Calculator;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		 Scanner OP = new Scanner(System.in);
		    System.out.print("Enter an Operator: ");
		    String in = OP.next();
		    char operator = in.charAt(0);

		    System.out.print("Enter a number: ");
		    in = OP.next();
		    double number1 = Double.parseDouble(in);

		    System.out.print("Enter another number: ");
		    in = OP.next();
		    double number2 = Double.parseDouble(in);

		    if(operator == '+') {
		    	
		        double answer = number1 + number2;
		        System.out.println(answer);
		        
		    } else if(operator == '-') {
		    	
		        double answer = number1 - number2;
		        System.out.println(answer);
		    } else if(operator == 'x') {
		    	
		        double answer = number1 * number2;
		        System.out.println(answer);
		    } else if(operator == '/') {
		    	
		        double answer = number1 / number2;
		        System.out.println(answer);
		    } else {
		    	
		        double answer = number1 % number2;
		        System.out.println(answer);
		        
		    }
		}
}