package org.example;
import java.util.*;
public class UC2{
        public static void main(String[] args) {
            System.out.println("Enter the name");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            System.out.println("java HelloApp " + name);
            System.out.println("Hello " + name);
        }
}
