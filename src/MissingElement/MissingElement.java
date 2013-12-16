package MissingElement;

/**
 * Created by Einstine on 12/12/13.
 */
public class MissingElement {
    public static int solution(int[] A){
        if (A.length == 0) return 0;
        long sum = 0;
        for (int i:A){
            sum += i;
        }
//        int exp = (((2+A.length)*(A.length+1))/2);
        return (int) ((((2+A.length)*(A.length+1))/2)-sum);
    }

    public static void main(String[] args) {
        int[] A = {2, 3, 6, 5, 1,4,8};
        int[] B = {};
        int[] C = {2};
        int[] D = {1,3};
        int[] E = {1};
        int[] F = {1,2};
        System.out.println(solution(A));
        System.out.println(solution(B));
        System.out.println(solution(C));
        System.out.println(solution(D));
        System.out.println(solution(E));
        System.out.println(solution(F));
    }
}
