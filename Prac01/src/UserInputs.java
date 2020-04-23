import java.util.Scanner;

public class UserInputs 
{
    public void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a int: ");
        int number = keyboard.nextInt();

        System.out.println("number entered is: "+ number);
        keyboard.close();
    }
}
