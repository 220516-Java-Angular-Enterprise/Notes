package com.revature.yolp.ui;

import com.revature.yolp.models.User;
import com.revature.yolp.services.UserService;



import java.util.Scanner;
import java.util.UUID;

/* This class purpose is to ask users to login, signup, or exit. */
public class StartMenu implements IMenu {

    private final UserService userService;

    public StartMenu(UserService userService) {
        this.userService = userService;
    }


    @Override
    public void start() {
        /*For user input*/
        Scanner scan = new Scanner(System.in);


        /* Break label. */

        exit:
        {
            while (true) {

                displayWelcomeMsg();

                /*Asking user for their input*/
                System.out.print("\nEnter: ");
                String input = scan.nextLine();

                /* Switch case, similar to an if else statement */

                switch (input) {

                    /* If user enters 1, 2, or x */
                    case "1":
                        login();
                        break;
                    case "2":
                        signup();
                        break;
                    case "x":
                        System.out.println("\nThank you for your patronage!");
                        /*Breaking out of everything*/
                        break exit;
                    default:
                        System.out.println("\nInvalid input.");
                        break;
                }
            }
        }
    }

    private void displayWelcomeMsg() {
        System.out.println("\nWelcome to Yolp");
        System.out.println("[1] Login");
        System.out.println("[2] Signup");
        System.out.println("[x] Exit");
    }

    private void login() {
        System.out.println("\nWIP");
    }

    private void signup() {

        String username;
        String password;
        Scanner scan = new Scanner(System.in);


        completeExit:
        {
            while (true) {
                System.out.println("\nCreating Account...");

                while (true) {
                    System.out.print("\nUsername: ");
                    username = scan.nextLine();

                    if (userService.isValidUsername(username)) {
                        System.out.println("Accepted.");
                        break;
                    } else System.out.println("Invalid Username. Username requires 8-20 characters.");
                }


                while (true) {
                    System.out.print("\nPassword: ");
                    password = scan.nextLine();


                    if (userService.isValidPassword(password)) {
                        System.out.print("\nRe enter password again: ");
                        String confirm = scan.nextLine();


                        if (password.equals(confirm)) break;
                        else System.out.println("Password does not match.");
                    } else
                        System.out.println("Invalid password. Minimum eight characters, at least one letter, one number and one special character:");
                }
                confirmExit:
                {
                    while (true) {
                        System.out.println("\nPlease confirm user credentials (y/n)");
                        System.out.println("\nUsername: " + username);
                        System.out.println("\nPassword: " + password);

                        System.out.print("\nEnter: ");
                        String input = scan.nextLine();

                        switch (input) {
                            case "y":
                                User user = new User(UUID.randomUUID().toString(), username, password, "DEFAULT");
                                new MainMenu(user).start();
                                break completeExit;
                            case "n":
                                break confirmExit;
                            default:
                                System.out.println("Invalid input.");
                                break;
                        }
                    }
                }


            }
        }
    }
}
