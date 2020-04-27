package tsp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class IntegerPermutation 
{
    public List<Integer> nextPermutation(List<Integer> sequence)
    {
        boolean escape = true;
        int edge = sequence.size() -1;
        for (; edge >= 0; edge--)
        {
            if (sequence.get(edge)< sequence.get(edge+1))
            {
                escape = false;
                break;
            }
        }
        if (escape)
        {
            return null;
        }
        int topRarr = edge +1;
        int botRarr = sequence.size()-1;
        while (topRarr < botRarr)
        {
            Integer swapper = sequence.get(botRarr);
            sequence.set(botRarr, sequence.get(topRarr));
            sequence.set(topRarr, swapper);
            topRarr--;
            botRarr++;
        }
        topRarr = sequence.size() -1;
        while (sequence.get(topRarr) > sequence.get(edge))
        {
            topRarr--;
        }
        topRarr++;
        Integer swapper = sequence.get(edge);
        sequence.set(edge, sequence.get(topRarr));
        sequence.set(topRarr, swapper);
        return sequence;
    }

    public Set<List<Integer>> allPermutations(int n)
    {
        if (n <= 0)
        {
            throw new IllegalArgumentException();
        }
         
        List<Integer> initialParam = new ArrayList<Integer>(n);
        Set<List<Integer>> allPerms = new LinkedHashSet<List<Integer>>();
        for (int i = 0; i < initialParam.size(); i++) 
        {
            initialParam.set(i, i);
        }
        allPerms.add(initialParam);
        List<Integer> currentPerm = nextPermutation(initialParam);
        while (currentPerm != null) 
        {
            allPerms.add(currentPerm);
            currentPerm = nextPermutation(currentPerm);
        }
        return allPerms;
    }

    
}