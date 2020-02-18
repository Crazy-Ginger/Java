import java.util.Scanner;

public class Exec6
{
    public static String testOne(String sent)
    {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < sent.length(); i++)
        {
            if (sent.charAt(i) != ' ' && sent.charAt(i) != ',' && sent.charAt(i) != ';')
            {
                text.append(sent.charAt(i));
            }
        }
        return text.toString();
    }

    public static String testTwo(String sent)
    {
        StringBuilder text = new StringBuilder();
        boolean toUp = true;
        for (int i = 0; i < sent.length(); i++)
        {
            
            if (sent.charAt(i) != ' ' && sent.charAt(i) != ',' && sent.charAt(i) != ';' && !toUp)
            {
                text.append(Character.toLowerCase(sent.charAt(i)));
            }
            else if (sent.charAt(i) == ' ')
            {
                toUp = true;
            }
            else if (toUp && sent.charAt(i) != ' ' && sent.charAt(i) != ',' && sent.charAt(i) != ';')
            {
                text.append(Character.toUpperCase(sent.charAt(i)));
                toUp = false;
            }
        }
        return text.toString();
    }

    public static void testThree(String sent)
    {
        StringBuilder word = new StringBuilder();
        
        for (int i = 0; i < sent.length(); i ++)
        {
            if (Character.isUpperCase(sent.charAt(i)) && word.length() > 0)
            {
                System.out.println(word.toString());
                word.delete(0, word.length());
                word.append(sent.charAt(i));
            }
            else
            {
                word.append(sent.charAt(i));
            }
        }
        System.out.println(word.toString());
    }


    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        
        String sent = keyboard.nextLine();
        //System.out.println(testOne(sent));
        //System.out.println(testTwo(sent));
        testThree(sent);
        keyboard.close();
    }
}