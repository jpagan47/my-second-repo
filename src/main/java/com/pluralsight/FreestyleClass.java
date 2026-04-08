package com.pluralsight;

public class Main{
    public static void main(String[] args) {
        String personsName = "Jose Alexander";
        printGreeting("Dr.", personsName);
        // You have to put a "f" if using float, JUST USE DOUBLE
        float f = 7.24f;
        long creditCard = 5200_2223_2223L;
        System.out.println(creditCard);

    }

    public static void printGreeting(String tittle, String name) {
        System.out.println("Hi " + tittle + "" + name);

    }

    public static void creditCard( double creditcard , double f) {
        System.out.println("Your random number is " + (creditcard * f));
    }

    public static void main(String[] args) {
        long l = 1L;
        int i;
        String s = "";
        s = 1;

    }
}
