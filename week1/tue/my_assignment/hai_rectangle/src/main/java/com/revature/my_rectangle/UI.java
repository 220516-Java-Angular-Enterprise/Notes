package com.revature.my_rectangle;

public class UI {
    static Comparator compare = new Comparator();
    Rectangle a = new Rectangle("Andrew", 20, 10);
    Rectangle b = new Rectangle("Bee", 20, 15);

    Main hi = new Main();

    public void main(String[] args){
    System.out.println(compare.isLessThanA(a, b));

    System.out.println(compare.isLessThanP(a, b));

    }
}
