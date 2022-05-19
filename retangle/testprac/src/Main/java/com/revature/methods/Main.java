package com.revature.methods;

public class Main {
    public static void main(String[] args) {
        Methods method = new Methods();
        Extra ext = new Extra();

        ext.setAge(47);
        ext.setNum(97);

        System.out.println(method.add(3, 5));
        System.out.println(method.hello(43));
        System.out.println(ext.getAge());
    }
}
