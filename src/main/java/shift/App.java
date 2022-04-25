package shift;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("This is a Caesar-Shift application.");
        System.out.println("Please select whether you would like to encode or decode your text!");
        System.out.println("Enter e to encode or d to decode:  ");

        try{
            String selection = scanner.nextLine();
            if (selection.equalsIgnoreCase("encode") || selection.equalsIgnoreCase("e")){
                System.out.println("Enter text to encode: ");
                String plainText = scanner.nextLine();
                System.out.println("Enter a shift key between 1 and 25: ");
                int shiftKey = scanner.nextInt();
                ExpressInCode expressInCode= new ExpressInCode();
                String encoded = (expressInCode.putIntoCode(plainText, shiftKey));
                System.out.println("Check out your encoded text below with a shift key of " + shiftKey+ "!");
                System.out.println(encoded);
            } else if (selection.equalsIgnoreCase("decode") || selection.equalsIgnoreCase("d")){
                System.out.println("Enter text to decode: ");
                String codedText = scanner.nextLine();
                System.out.println("Enter a shift key between 1 and 25: ");
                int shiftKey = scanner.nextInt();
                Decode decode= new Decode();
                String decoded = (decode.undoCode(codedText, shiftKey));
                System.out.println("Check out your decoded text below with a shift key of " +shiftKey+ "!");
                System.out.println(decoded);
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
