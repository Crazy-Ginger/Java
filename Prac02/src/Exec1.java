import java.util.Scanner;
import java.lang.Math;

public class Exec1
{
    public static int toDec(String bin)
    {
        int dec = 0;
        int length = bin.length();
        for (int i = 0; i < bin.length(); i++)
        {
            dec += Character.getNumericValue(bin.charAt(i)) * Math.pow(2, length - (1+i));
        }
        return dec;
    }
        public static  void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Decinary: "+ toDec(keyboard.nextLine()));
        keyboard.close();
    }
}