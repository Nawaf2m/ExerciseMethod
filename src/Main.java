import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //Q1
//        int smallest = findSmallestNumber();
//        System.out.println("The smallest value is " + smallest);
//        System.out.println();
        //Q2
//        System.out.println("The number is " + checkNumber());
//        System.out.println();
        //Q3
        checkPassword();
    }
    public static int findSmallestNumber(){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Input the first number: ");
        numbers.add(in.nextInt());

        System.out.print("Input the second number: ");
        numbers.add(in.nextInt());

        System.out.print("Input the third number: ");
        numbers.add(in.nextInt());

        int smallest = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) < smallest){
                smallest = numbers.get(i);
            }
        }
        return smallest;
    }
    public static String checkNumber(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = in.nextInt();

        if (number > 0)
            return "positive";
        else if (number < 0)
            return "negative";
        else
            return "zero";
    }
    public static void checkPassword(){
        Scanner in = new Scanner(System.in);
        System.out.println("1. A password must have at least eight characters.");
        System.out.println("2. A password consists of only letters and digits.");
        System.out.println("3. A password must contain at least two digits.");
        System.out.print("Input a password (You are agreeing to the above Terms and Conditions.): ");
        String password = in.nextLine();

        boolean valid = true;
        if (password.length() < 8){
            valid = false;
        }

        if (!Pattern.matches("\\w+", password)){
            valid = false;
        }
        if (password.contains("_")){
            valid = false;
        }

        String c;
        int counter = 0;
        for (int i = 0; i < password.length(); i++){
            c = String.valueOf(password.charAt(i));
            if (Pattern.matches("\\d",c)){
                counter++;
            }
            if (counter >= 2){
                break;
            }
        }
        if (counter < 2){
            valid = false;
        }

        if (valid){
            System.out.println("Password is valid: " + password);
        }
        else{
            System.out.println("Password is not valid: " + password);
        }
    }

}