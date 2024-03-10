package com.java;

public class DemoMain {

    public static void main(String[] args) {

        Person person = new Person.Builder()
                .fName("abc")
                .lName("xyz")
                .email("pqr@gmail.com")
                .phone("1234567890")
                .build();

        System.out.println(person);

    }

}
