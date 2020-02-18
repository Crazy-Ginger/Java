import java.util.Scanner;
public class Exec2
{
    public void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter banana: ");
        int banana = keyboard.nextInt();
        
        int price = 3*banana + 5;
        if (price > 50)
        {
            System.out.println("Price: " + (price - 3.5));
        }
        else
        {
            System.out.println("Price: " + (price-0.01));
        }
        keyboard.close();
    }
}