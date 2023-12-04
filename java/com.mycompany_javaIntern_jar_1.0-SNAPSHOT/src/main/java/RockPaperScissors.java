/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"Rock", "Paper", "Scissors"};

        System.out.println("Rock, Paper, or Scissors? Enter your choice:");

        String userChoice = scanner.nextLine();

        // Validate user input
        if (!isValidChoice(userChoice)) {
            System.out.println("Invalid choice. Please choose Rock, Paper, or Scissors.");
            scanner.close();
            return;
        }

        int computerIndex = random.nextInt(3);
        String computerChoice = options[computerIndex];

        System.out.println("Computer chose: " + computerChoice);

        String result = determineWinner(userChoice, computerChoice);
        System.out.println(result);

        scanner.close();
    }

    private static boolean isValidChoice(String choice) {
        return choice.equalsIgnoreCase("Rock") || choice.equalsIgnoreCase("Paper") || choice.equalsIgnoreCase("Scissors");
    }

    private static String determineWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "It's a tie!";
        } else if ((user.equals("Rock") && computer.equals("Scissors")) ||
                   (user.equals("Paper") && computer.equals("Rock")) ||
                   (user.equals("Scissors") && computer.equals("Paper"))) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }
}

