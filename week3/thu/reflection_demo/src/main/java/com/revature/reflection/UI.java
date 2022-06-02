package com.revature.reflection;

import java.io.PrintStream;
import java.util.Arrays;

public class UI {
    static PrintStream cout = System.out;

    public static void main(String[] args) {
        Class<Burner> trash = Burner.class;

        Burner burn1 = new Burner();
        Class<? extends Burner> trash2 = burn1.getClass();

        cout.println("Class name: "+trash2.getName());
        cout.println("Fields: "+ Arrays.toString(trash2.getDeclaredFields()));
    }
}
