/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class QuizGame {
    


    private static final String[][] questions = {
            {"What is the capital of France?", "Paris"},
            {"Which planet is known as the Red Planet?", "Mars"},
            {"What is the largest mammal?", "Blue Whale"},
            // Add more questions as needed
    };

    private static int score = 0;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Quiz Game!");

        for (String[] question : questions) {
            askQuestion(question[0], question[1]);
        }

        System.out.println("Quiz completed! Your final score is: " + score + "/" + questions.length);

        scanner.close();
    }

    private static void askQuestion(String prompt, String correctAnswer) {
        System.out.println("\n" + prompt);
        System.out.print("Your answer: ");
        String userAnswer = scanner.nextLine();

        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Correct! +1 point");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is: " + correctAnswer);
        }
    }
}

