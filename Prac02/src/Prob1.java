//import java.util.Scanner;

public class Prob1
{
    public static int[] resample(int[] datapoints)
    {
        int[] resampled = new int [datapoints.length * 2 - 1];
        
        for (int i = 0; i < resampled.length; i++)
        {
            if (i%2 == 0)
            {
                System.out.println(datapoints[i/2]);
                resampled[i] = datapoints[i/2];
            }
            else
            {
                System.out.println(datapoints[i/2 - 1] + " "+ datapoints[i/2  + 1]);
                resampled[i] = (datapoints[i/2-1] + datapoints[i/2 +1])/2;
            }
        }
        return resampled;
    }

    public static void main(String[] args)
    {
        int[] list = {1, 5, 13, 21};
        System.out.println(resample(list));

    }
}