package com.revature.interfaceseg.bad;

public interface PizzaApp {

    void acceptOrderOnline();
    void acceptWalkinOrders();
    void acceptTelephonicOrders();

    // Bad

    void acceptPaymentsOnline();
    void acceptOnlyCash();
}
