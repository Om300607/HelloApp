import java.util.Scanner;

public class UC3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name (or press Enter for default): ");
        String input = sc.nextLine().trim();  // read full line, handle empty input

        // If user enters nothing, default to "World"
        String name = input.isEmpty() ? "World" : input;

        System.out.println("Hello, " + name + "!");

        sc.close();
    }
}