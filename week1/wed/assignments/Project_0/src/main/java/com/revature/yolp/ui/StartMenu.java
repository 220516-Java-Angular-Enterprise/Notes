package main.java.com.revature.yolp.ui;

import java.util.Scanner;

/* This class purpose is to ask users to login, signup, or exit. */
public class StartMenu implements IMenu {

    private final UserService userService;


    @Override
    public void start(){
        /*For user input*/
    }
        Scanner scan = new Scnanner(System.in);

        exit:{
            while(true) {

        displayWelcomeMsg();

        /*Asking user for their input*/
        System.out.println("\nEnter: ");
        String input = scan.nextLine();

        switch (input) {
            case "1":
                login();
                break;
            case "2":
                signup();
                break;
            case "x":
                System.out.println("\nThank you for your patronage!");
                /*Breaking out of everything*/
                break;
            default:
                System.out.println("\nInvalid input.");
                break;
           }
        }
    }
    private void displayWelcomeMsg(){
            System.out.println("\nWelcome to Yolp");
            System.out.println("[1] Login");
            System.out.println("[2] Signup");
            System.out.println("[x] Exit");
        }

    private void login(){
        System.out.println("\nWIP");
    }

    private void signup() {

        Scanner scan = new Scanner(System.in);

        System.out.println("\nCreating Account...");

        while (true) {
            System.out.println("\Username: ");
            String username = scan.nextLine();

            if (userService.isValidUsername(username)) {
                System.out.println("Accepted.");
                break;
            } else System.out.println("Username requires 8-20 characters.");
        }


            while (true) {
            System.out.println("\nPassword: ");
            String password = scan.nextLine();



            if (userService.isValidPassword(password)) break;
            else System.out.println("Password does not match");

            if (password.equals(confirm))
        }
            else System.out.println("Invalid password. Minimum eight characters, at least one letter, one number and one special character:");
            System.out.println("\nRe enter password again: ");
            String confirm = scan.nextLine();



    }
}
