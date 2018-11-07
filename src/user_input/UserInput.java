package user_input;

import java.util.Scanner;

public class UserInput {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is your birth year?");
//        int birthYear = Integer.parseInt(scanner.nextLine());
        int birthYear = scanner.nextInt();
        int age = 2018 - birthYear;
        scanner.nextLine();
        
        System.out.println("Please type your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Your name is " + name + " and you are " + age + " years old.");
        scanner.close();
    }
}
