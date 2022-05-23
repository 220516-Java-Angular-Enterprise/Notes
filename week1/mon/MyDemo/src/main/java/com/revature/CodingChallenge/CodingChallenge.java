package com.revature.CodingChallenge;

public class CodingChallenge {

    private String s;

    public int mostRecurringInteger(String s) {
        //throw new RuntimeException("TODO! Needs implementation...");
        char output = 0;
        int l = s.length();
        int max_count = 0;
        int count = 1;
        //Scanner scan = new Scanner(System.in);
        //System.out.println("Enter a string: " );
        //s = scan.nextLine();
        for (int i = 1; i <= l; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                if (count > max_count) {
                    max_count = count;
                    output = s.charAt(i - 1);
                }
                count = 1;
            }
        }
        if (count > max_count) {//last run
            output = s.charAt(l - 1);
        }
        return output;
    }
}








