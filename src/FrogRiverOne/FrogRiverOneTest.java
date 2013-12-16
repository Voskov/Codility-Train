package FrogRiverOne;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by Einstine on 12/15/13.
 */
public class FrogRiverOneTest {
    
    @Test
    public void testSanity(){
        int[] A = {1,1,3,1,4,2,3,5,4};
        int X = 5;
        junit.framework.Assert.assertEquals("Should pass", 7, FrogRiverOne.solution(X, A));
    }
    @Test
    public void testOne(){
        int[] A = {1};
        int X = 1;
        junit.framework.Assert.assertEquals("Should pass", 0, FrogRiverOne.solution(X, A));
    }
    @Test
    public void testTwo(){
        int[] A = {1,2};
        int X = 2;
        junit.framework.Assert.assertEquals("Should pass", 1, FrogRiverOne.solution(X, A));
    }
    @Test
    public void testReverse(){
        int[] A = {2,1};
        int X = 2;
        junit.framework.Assert.assertEquals("Should pass", 1, FrogRiverOne.solution(X, A));
    }
    @Test
    public void testRepeating(){
        int[] A = {1,2,2};
        int X = 2;
        junit.framework.Assert.assertEquals("Should pass", 1, FrogRiverOne.solution(X, A));
    }
    @Test
    public void testMissing(){
        int[] A = {1,4,3};
        int X = 4;
        junit.framework.Assert.assertEquals("Should fail", -1, FrogRiverOne.solution(X, A));
    }
    @Test
    public void testLargeArray(){
        int[] A = new int[100000];
        int X = 9999;
        for (int i = 0; i < 100000; i++){
            A[i] = i;
        }
        junit.framework.Assert.assertEquals("Should pass", 9999, FrogRiverOne.solution(X, A));
    }


    @Test
    public void testLargeRepeatingArray(){
        int[] A = new int[100000];
        int X = 8888;
        for (int i = 0; i < 100000; i++){
            A[i] = 10000000;
        }
        junit.framework.Assert.assertEquals("Should pass", -1, FrogRiverOne.solution(X, A));
    }
}