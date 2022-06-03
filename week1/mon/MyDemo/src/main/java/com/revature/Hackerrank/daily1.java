package com.revature.Hackerrank;

import java.util.Scanner;

public class daily1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of grades: ");
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            int grade=0;
            System.out.println("Enter grade: ");
            int remainder= grade%5;
            grade = scan.nextInt();
            if (grade >= 38) {
                if (remainder >= 3) {
                    grade = grade + (5 - remainder);
                }
            }
            System.out.println(grade);
            }

        }
    }


