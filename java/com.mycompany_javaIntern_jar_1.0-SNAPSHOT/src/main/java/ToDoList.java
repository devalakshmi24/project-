/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
 import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private static ArrayList<String> toDoItems = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- ToDo List Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Delete Item");
            System.out.println("3. Update Item");
            System.out.println("4. View Items");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    deleteItem();
                    break;
                case 3:
                    updateItem();
                    break;
                case 4:
                    viewItems();
                    break;
                case 5:
                    System.out.println("Exiting ToDo List. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    private static void addItem() {
        System.out.print("Enter the new item: ");
        String newItem = scanner.nextLine();
        toDoItems.add(newItem);
        System.out.println("Item added successfully.");
    }

    private static void deleteItem() {
        if (toDoItems.isEmpty()) {
            System.out.println("ToDo List is empty. Nothing to delete.");
            return;
        }

        System.out.print("Enter the index of the item to delete (0 to " + (toDoItems.size() - 1) + "): ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        if (index >= 0 && index < toDoItems.size()) {
            String deletedItem = toDoItems.remove(index);
            System.out.println("Item deleted: " + deletedItem);
        } else {
            System.out.println("Invalid index. Please enter a valid index.");
        }
    }

    private static void updateItem() {
        if (toDoItems.isEmpty()) {
            System.out.println("ToDo List is empty. Nothing to update.");
            return;
        }

        System.out.print("Enter the index of the item to update (0 to " + (toDoItems.size() - 1) + "): ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        if (index >= 0 && index < toDoItems.size()) {
            System.out.print("Enter the new value for the item: ");
            String updatedItem = scanner.nextLine();
            toDoItems.set(index, updatedItem);
            System.out.println("Item updated successfully.");
        } else {
            System.out.println("Invalid index. Please enter a valid index.");
        }
    }

    private static void viewItems() {
        if (toDoItems.isEmpty()) {
            System.out.println("ToDo List is empty.");
        } else {
            System.out.println("\n--- ToDo List ---");
            for (int i = 0; i < toDoItems.size(); i++) {
                System.out.println(i + ". " + toDoItems.get(i));
            }
        }
    }
}

