import java.util.Scanner;

public class Exec8
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter height: ");
        int height = keyboard.nextInt();
        boolean swap = true;
        for (int i = 1; i <= height; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                if (swap)
                {
                    System.out.print("1");
                    swap = false;
                }
                else
                {
                    System.out.print("0");
                    swap = true;
                }
                
            }
            System.out.print("\n");
        }
        keyboard.close();
    }
}