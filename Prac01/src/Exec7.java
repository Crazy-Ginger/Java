import java.util.Scanner;

public class Exec7
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        String num1 = keyboard.nextLine();
        String num2 = keyboard.nextLine();

        int leng = 0;
        int diff = 0;
        if (num1.length() < num2.length())
        {
            leng = num1.length();
            diff = num2.length() - num1.length();
        }
        else
        {
            leng = num2.length();
            diff = num1.length() - num2.length();
        }
        StringBuilder binary = new StringBuilder();
        for (int i = 0; i < leng; i++)
        {
            if (num1.charAt(i) == num2.charAt(i))
            {
                binary.append("1");
            }
            else
            {
                binary.append("0");
            }
        }
        for (int i = 0; i < diff; i++)
        {
            binary.append("0");
        }
        System.out.print("Binary: " + binary);
        keyboard.close();
    }
}