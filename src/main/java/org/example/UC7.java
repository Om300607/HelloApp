package org.example;

public class UC7 {
    public static void main(String[] args) {
        if (args.length == 0) {
            // Default greeting when no arguments are passed
            System.out.println("Hello, World!");
        } else {
            // Efficiently join all arguments with a delimiter
            String names = String.join(", ", args);
            System.out.println("Hello, " + names + "!");
        }
    }
}
