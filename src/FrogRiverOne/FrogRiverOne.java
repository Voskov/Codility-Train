package FrogRiverOne;

/**
 * Created by Einstine on 12/15/13.
 */
public class FrogRiverOne {
    public static int solutionA(int X, int[] A){
        int[] count = new int[X];
        for (int i = 0; i < A.length; i++){
            try{
                count[A[i]-1]++;
            } catch (ArrayIndexOutOfBoundsException e){ }
            if (i >= X - 1){
                for (int j = 0; j< count.length; j++){
                    if (count[j] == 0){
                        break;
                    }
                    if (j == count.length - 1){
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public static int solution(int X, int[] A){
        boolean[] complete = new boolean[X];
        int done = X;
        for (int i = 0; i < A.length; i++){
            try{
                if (!complete[A[i]-1]){
                    complete[A[i]-1] = true;
                    done--;
                }
            } catch (ArrayIndexOutOfBoundsException e) {};
            if (done == 0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int X = 1;
        int[] A = {1};
        System.out.println(solution(X, A));
    }
}
