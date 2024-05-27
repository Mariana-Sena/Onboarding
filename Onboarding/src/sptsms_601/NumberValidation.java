package sptsms_601;

public class NumberValidation {
	public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Provide one integer number as argument.");
            return;
        }
        
        try {
            int number = Integer.parseInt(args[0]);
            String result = isValidNumber(number) ? "Válido" : "Inválido";
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Provide a valid integer.");
        }
    }

    public static boolean isValidNumber(int number) {
        if (number % 2 == 1 || number  % 2 == -1) {
            return true; 
        } else if (number >= 2 && number <= 5) {
            return true; 
        } else if (number > 20) {
            return true; 
        } else {
            return false; 
        }
    }
}
