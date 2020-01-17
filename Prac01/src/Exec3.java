import java.util.Scanner;

public class Exec3
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Age: ");
        int age = keyboard.nextInt();
        System.out.print("Heart rate: ");
        double rate = keyboard.nextInt();

        double maxHeart = 208 - (0.7*age);
        if (rate >= 0.9*maxHeart)
        {
            System.out.print("Ineterval training");
        }
        else if (rate >= 0.7*maxHeart)
        {
            System.out.print("Threshold training");
        }
        else if (rate >= 0.5*maxHeart)
        {
            System.out.print("Aerobatic training");
        }
        else if (rate < 0.5*maxHeart)
        {
            System.out.print("Sofa potato");
        }
        else
        {
            System.out.print("You have escaped");
        }        
        keyboard.close();
    }
}