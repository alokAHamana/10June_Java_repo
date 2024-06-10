package com.practicalfile;

public class Customer {

    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name; }

    public static void main(String[] args) {
        Customer c1 = new Customer(107, "Alok");
        Customer c2 = new Customer(200, "ram");

        System.out.println(c2.id);
        System.out.println(c1.name);
        
    }
}

                //output = 200,Alok

