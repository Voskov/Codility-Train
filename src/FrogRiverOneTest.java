import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Einstine on 12/15/13.
 */
public class FrogRiverOneTest {
    
    @Test
    public void testSanity(){
        int[] A = {4,1,3,2};
        junit.framework.Assert.assertEquals("Should pass", 1, FrogRiverOne.solution(A));
    }
    //Nothing
    @Test
    public void testOne(){
        int[] A = {1};
        junit.framework.Assert.assertEquals("Should pass", 1, FrogRiverOne.solution(A));
    }
    @Test
    public void testTwo(){
        int[] A = {1,2};
        junit.framework.Assert.assertEquals("Should pass", 1, FrogRiverOne.solution(A));
    }
    @Test
    public void testReverse(){
        int[] A = {2,1};
        junit.framework.Assert.assertEquals("Should pass", 1, FrogRiverOne.solution(A));
    }
    @Test
    public void testRepeating(){
        int[] A = {1,2,2};
        junit.framework.Assert.assertEquals("Should fail", 0, FrogRiverOne.solution(A));
    }
    @Test
    public void testMissing(){
        int[] A = {1,4,3};
        junit.framework.Assert.assertEquals("Should fail", 0, FrogRiverOne.solution(A));
    }

    public void testLargeArray(){
        int[] A = new int[100000];
        for (int i = 0; i < 100000; i++){
            A[i] = i;
        }
        junit.framework.Assert.assertEquals("Should pass", 1, FrogRiverOne.solution(A));
    }

    public void testLargeRepeatingArray(){
        int[] A = new int[100000];
        for (int i = 0; i < 100000; i++){
            A[i] = 10000000;
        }
        junit.framework.Assert.assertEquals("Should pass", 1, FrogRiverOne.solution(A));
    }
}
