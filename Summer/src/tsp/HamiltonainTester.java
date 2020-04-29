package tsp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class HamiltonainTester 
{
    @Test
    public void testIsHamiltonian()
    {
        Hamiltonian h = new Hamiltonian();

        int[][] test1 = {{0, 1, 0, 1, 0},
                        {1, 0, 1, 1, 1},
                        {0, 1, 0, 0, 1},
                        {1, 1, 0, 0, 1},
                        {0, 1, 1, 1, 0}};
        int[][] test2 =  {{0, 1, 0, 1, 0},
                        {1, 0, 1, 1, 1},
                        {0, 1, 0, 0, 1},
                        {1, 1, 0, 0, 0},
                        {0, 1, 1, 0, 0}};
        int[][] test3 =  {{0, 1, 0, 0, 0},
                        {1, 0, 1, 1, 1},
                        {0, 1, 0, 0, 1},
                        {1, 1, 0, 0, 1},
                        {0, 1, 1, 1, 0}};
        assertTrue(h.testIsHamiltonian(test1));
        assertFalse(h.testIsHamiltonian(test2));
        assertFalse(h.testIsHamiltonian(test3));
    }

    @Test
    public void testHamBackTrack()
    {
        Hamiltonian h = new Hamiltonian();

        int[][] test1 = {{0, 1, 0, 1, 0},
                        {1, 0, 1, 1, 1},
                        {0, 1, 0, 0, 1},
                        {1, 1, 0, 0, 1},
                        {0, 1, 1, 1, 0}};
        int[][] test2 =  {{0, 1, 0, 1, 0},
                        {1, 0, 1, 1, 1},
                        {0, 1, 0, 0, 1},
                        {1, 1, 0, 0, 0},
                        {0, 1, 1, 0, 0}};
        int[][] test3 =  {{0, 1, 0, 0, 0},
                        {1, 0, 1, 1, 1},
                        {0, 1, 0, 0, 1},
                        {1, 1, 0, 0, 1},
                        {0, 1, 1, 1, 0}};
        assertTrue(h.testHamBackTrack(test1));
        assertFalse(h.testHamBackTrack(test2));
        assertFalse(h.testHamBackTrack(test3));
    }
}