import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Einstine on 12/15/13.
 */
public class PremCheckTest {
    @Test
    public void testSanity(){
        int[] A = {4,1,3,2};
        Assert.assertEquals("Should pass", 1, PremCheck.solution(A));
    }
    @Test
    public void testOne(){
        int[] A = {1};
        Assert.assertEquals("Should pass", 1, PremCheck.solution(A));
    }
    @Test
    public void testTwo(){
        int[] A = {1,2};
        Assert.assertEquals("Should pass", 1, PremCheck.solution(A));
    }
    @Test
    public void testReverse(){
        int[] A = {2,1};
        Assert.assertEquals("Should pass", 1, PremCheck.solution(A));
    }
    @Test
    public void testRepeating(){
        int[] A = {1,2,2};
        Assert.assertEquals("Should fail", 0, PremCheck.solution(A));
    }
    @Test
    public void testMissing(){
        int[] A = {1,4,3};
        Assert.assertEquals("Should fail", 0, PremCheck.solution(A));
    }

    public void testLargeArray(){
        int[] A = new int[100000];
        for (int i = 0; i < 100000; i++){
            A[i] = i;
        }
        Assert.assertEquals("Should pass", 1, PremCheck.solution(A));
    }

    public void testLargeRepeatingArray(){
        int[] A = new int[100000];
        for (int i = 0; i < 100000; i++){
            A[i] = 10000000;
        }
        Assert.assertEquals("Should pass", 1, PremCheck.solution(A));
    }
}
