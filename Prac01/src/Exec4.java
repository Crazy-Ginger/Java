import java.util.Scanner;
import java.lang.Math;

public class Exec4
{
    public void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter sides: ");
        double a = keyboard.nextInt();
        double b = keyboard.nextInt();
        double c = keyboard.nextInt();
        double semiParam = (a+b+c)/2;
        System.out.print("Area: " + Math.sqrt(semiParam*(semiParam-a)*(semiParam-b)*(semiParam-c)));
        keyboard.close();
    }
}