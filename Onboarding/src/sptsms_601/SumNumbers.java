package sptsms_601;

public class SumNumbers {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Provide two integer numbers as arguments.");
            return;
        }
        
        
        try {
            int n1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);
            int sum = n1 + number2;
            
            int maxIntValue = Integer.MAX_VALUE;
            
            if (n1 > maxIntValue - number2) {
                System.out.println("The sum exceeds the maximum value that can be represented by an int.");
            } else {
                System.out.println("The sum of the numbers " + n1 + " and " + number2 + " is " + sum + ".");
            	}
        	}catch (NumberFormatException e) {
                System.out.println("Please, provide valid integer numbers as arguments.");
            } finally {
                System.out.println(" ");
            }
    }
}
