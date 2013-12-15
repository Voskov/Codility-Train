/**
 * Created by Einstine on 12/12/13.
 */
public class TapeEquilibrium {
    public static int solution(int[] A) {
        long right = 0;
        long left = 0;
        for (int i:A){
            right += i;
        }
        long dif = right;
        int i = 0;
        int testOne = 0;
        int testTwo = 0;
        while (dif>0 && i < A.length){
            dif -= (2*A[i]);
            if (dif <= 0){
                testOne = (int) Math.abs(right - left);
            }
            left += A[i];
            right -= A[i];
            testTwo = (int) Math.abs(right - left);
            i++;
        }
        if (Math.abs(testOne) > Math.abs(testTwo)) return testTwo;
        else return testOne;

    }

    public static void main(String[] args) {
        int[] A = {3,1,2,4,3};
        int[] B = {2,1};
        System.out.println(solution(A));
        System.out.println(solution(B));
        System.out.println(solution(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(solution(new int[]{3}));

    }

}
