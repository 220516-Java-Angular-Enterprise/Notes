package com.revature.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/*
 * What is reflection?
 * Essentially lets your grab information on a class i.e. the class type, constructors, parameters, etc.
 * Reflection is unique to Java. Rare in other programming languages.
 */
public class Main {
    public static void main(String[] args) {
        /* I can use Reflection to get a class reference for primitive data types. */
        Class<Integer> integer = int.class;
        Class<Double> d = double.class;

        /* With Reflection, I can access objects information i.e. fields, constructors, and methods. */
        Hero myHero = new Hero("Com sigh", "120 wpm", Gender.FEMALE, "O(n!)");
        Example ex = new Example();

        Class<? extends Hero> heroClass = myHero.getClass();
        Class<? extends Example> exClass = ex.getClass();
        System.out.println("Class name: " + heroClass.getName());

        /* Reflection allows me to access all regardless if it is private in a class. */
        Field[] fields = heroClass.getDeclaredFields();
        Field[] exFields = exClass.getDeclaredFields();

        System.out.println("\nHero class:");
        for (Field f : fields) System.out.println(f.getName());

        System.out.println("\nExample class:");
        for (Field f : exFields) System.out.println(f.getName());

        /* Reflection allows me to access constructors as well. */
        System.out.println();
        Constructor[] constructors = heroClass.getConstructors();

        for (Constructor c : constructors) {
            if (c.getParameterCount() == 0) {
                System.out.println("no arg-constructor");
            }
            else {
                System.out.println("arg-constructor");
                Parameter[] parameters = c.getParameters();

                for (Parameter p : parameters) System.out.println(p.getName() + ": " + p.getType());
            }
        }

        System.out.println("\nClass method:");
        Method[] methods = heroClass.getMethods();

        for (Method m : methods) System.out.println(m.getName());
    }
}
