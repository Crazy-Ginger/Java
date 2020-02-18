//import java.util.Scanner;

public class Prob1
{
    public static int[] resample(int[] datapoints)
    {
        int[] resampled = new int [datapoints.length * 2 - 1];
        
        for (int i = 0; i < resampled.length; i+= 2)
        {
                resampled[i] = datapoints[i/2];
        } 
        for (int i = 1; i < resampled.length; i += 2)
        {
            resampled[i] = (resampled[i-1]+resampled[i+1])/2;
        }
        return resampled;
    }

    public static int[] resample(int[] datapoints, int scale)
    {
        
    }

    public static void main(String[] args)
    {
        int[] list = {1, 5, 13, 21};
        int[] retList = resample(list);

        for (int o: retList)
        {
            System.out.print(o + ", ");
        }
    }
}