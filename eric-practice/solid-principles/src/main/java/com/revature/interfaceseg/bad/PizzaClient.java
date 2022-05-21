package com.revature.interfaceseg.bad;

public class PizzaClient implements PizzaApp{

    // Bad because pizza app is forced to have methods it  might not need. What if the client only does offline orders
    // it is forced to have online fuctions

    @Override
    public void acceptOrderOnline() {

    }

    @Override
    public void acceptWalkinOrders() {

    }

    @Override
    public void acceptTelephonicOrders() {

    }

    @Override
    public void acceptPaymentsOnline() {

    }

    @Override
    public void acceptOnlyCash() {

    }
}
