package MaxCounters;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

/**
 * Created by Einstine on 12/16/13.
 */
public class MaxCounterTest {
    @Test
    public void testOne(){
        int[] A = {1};
        int N = 1;
        int[] expected = {1};
        Assert.assertArrayEquals(expected, MaxCounter.solution(N, A));
    }
    @Test
    public void testThree(){
        int[] A = {1,3,2};
        int N = 3;
        int[] expected = {1,1,1};
        Assert.assertArrayEquals(expected, MaxCounter.solution(N,A));
    }
    @Test
    public void testThreeRepeat(){
        int[] A = {1,1,1};
        int N = 3;
        int[] expected = {3,0,0};
        Assert.assertArrayEquals(expected, MaxCounter.solution(N,A));
    }
    @Test
    public void testGreater(){
        int[] A = {1,1,3,1};
        int N = 2;
        int[] expected = {3,2};
        Assert.assertArrayEquals(expected, MaxCounter.solution(N,A));
    } 
    @Test
    public void testLargeEq(){
        int[] A = new int[100000];
        int[] expected = new int[100000];
        Arrays.fill(A,1);
        expected[0] = 100000;
        int N = 100000;
        Assert.assertArrayEquals(expected, MaxCounter.solution(N,A));
    }
    @Test
    public void testLargeOne(){
        int[] A = new int[100000];
        int[] expected = new int[100000];
        for (int i = 0; i<A.length; i++){
            A[i] = i+1;
        }
        Arrays.fill(expected,1);
        int N = 100000;
        Assert.assertArrayEquals(expected, MaxCounter.solution(N,A));
    }
}
