/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
 import java.util.Scanner;

public class BinaryToDecimalConverter {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryInput = scanner.nextLine();

        try {
            long decimalOutput = binaryToDecimal(binaryInput);
            System.out.println("Decimal equivalent: " + decimalOutput);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary input. Please enter a valid binary number.");
        }

        scanner.close();
    }

    private static long binaryToDecimal(String binary) {
        return Long.parseLong(binary, 2);
    }
}

