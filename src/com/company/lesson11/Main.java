package com.company.lesson11;

public class Main {
    public static void main(String[] args) {
        User user = new User("Alex1", 30);
        System.out.println(user.toString());

        User user1 = new User("Alex2", 27);
        System.out.println(user1.toString());

        System.out.println(user.equals(user1));
    }
}
