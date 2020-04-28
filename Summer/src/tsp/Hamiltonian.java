package tsp;

//import tsp.IntegerPermutation;
import java.util.List;
import java.util.Set;

public class Hamiltonian 
{
    public boolean isHamiltonian(int[][] adjacencyMatrix)
    {
        if (!checkUndirected(adjacencyMatrix))
        {
            throw new IllegalArgumentException();
        }

         //checks for unconnected nodes, if they exist graph cannot be hamiltonian
         for (int i = 0; i < adjacencyMatrix.length; i++)
         {
             int sum = 0;
             for (Integer summer : adjacencyMatrix[i])
             {
                 sum += summer;
             }
             if (sum == 0)
             {
                 return false;
             }
         }

        //tmp objects to get all possible paths
        IntegerPermutation tmp_object = new IntegerPermutation();
        Set<List<Integer>> paths = tmp_object.allPermutations(adjacencyMatrix.length);

        //loops through set of lists and checks if a list is a valid path between verticies if yes returns true
        for (List<Integer> path : paths)
        {
            boolean flag = true;
            for (int currentNode = 0; currentNode < path.size(); currentNode++)
            {
                if (path.get(currentNode) == path.get(path.size()-1))
                {
                    if (adjacencyMatrix[path.get(currentNode)][path.get(0)] == 0)
                    {
                        flag = false;
                        break;
                    }
                }
                else
                {
                    if (adjacencyMatrix[path.get(currentNode)][path.get(currentNode +1)] == 0)
                    {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    private boolean checkUndirected(int[][] adjacencyMatrix)
    {
        // Checks whether graph is directed by checking if values are same
        for (int x = 0; x < adjacencyMatrix.length; x++)
        {
            for (int y = 0; y < adjacencyMatrix[x].length; y++)
            {
                if (adjacencyMatrix[x][y] != adjacencyMatrix[y][x])
                {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isHamiltonianBacktrack(int[][] adjacencyMatrix)
    {
        if (!checkUndirected(adjacencyMatrix))
        {
            throw new IllegalArgumentException();
        }

         //checks for unconnected nodes, if they exist graph cannot be hamiltonian
         for (int i = 0; i < adjacencyMatrix.length; i++)
         {
             int sum = 0;
             for (Integer summer : adjacencyMatrix[i])
             {
                 sum += summer;
             }
             if (sum == 0)
             {
                 return false;
             }
         }


        return false;
    }
}