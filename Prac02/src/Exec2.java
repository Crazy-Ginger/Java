import java.util.Scanner;
import java.util.ArrayList;

public class Exec2
{
    public static String[] split(String sent)
    {   
        ArrayList <String> words = new ArrayList<>();


        StringBuilder wordAdder = new StringBuilder();
        for (int i = 0; i < sent.length(); i++)
        {
            if (!Character.isLetterOrDigit(sent.charAt(i)))
            {
                words.add(wordAdder.toString());
                wordAdder.setLength(0);
                if(i+1 < sent.length() && !Character.isLetterOrDigit(sent.charAt(i+1)) )
                {
                    i++;
                }
            }
            else 
            {
                wordAdder.append(sent.charAt(i));
            }
           
        }
        if (wordAdder.length() > 0 && wordAdder.charAt(0)!= ' ')
        {
             words.add(wordAdder.toString());
        }
        String[] returner  = words.toArray(new String[words.size()]);
        return returner;
    }
        public static  void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Split: "+ split(keyboard.nextLine()));
        keyboard.close();
    }
}