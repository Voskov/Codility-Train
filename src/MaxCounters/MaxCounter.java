package MaxCounters;

import java.util.Arrays;

/**
 * Created by Einstine on 12/16/13.
 */
public class MaxCounter {
    public static int[] solution(int N, int[] A){
        int[] ansArr = new int[N];
        int maxValue = 0;
        for(int i:A){
            if (i > N){
                Arrays.fill(ansArr, maxValue);
            } else{
                    ansArr[i-1]++;
                    maxValue = Math.max(maxValue, ansArr[i-1]);
            }
        }

        return ansArr;
    }
}
