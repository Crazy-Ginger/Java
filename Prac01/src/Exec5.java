import java.util.Scanner;

public class Exec5
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        int current, total = 0;
        System.out.print("Enter int to add (zero exits): ");
        current = keyboard.nextInt();
        while (current != 0)
        {
            total += current;
            System.out.print("Enter int to add (zero exits): ");
            current = keyboard.nextInt();
        }
        System.out.print("Total: " + total);
        keyboard.close();
    }
}