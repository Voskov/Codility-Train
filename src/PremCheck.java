/**
 * Created by Einstine on 12/15/13.
 */
public class PremCheck {
    public static int solution(int[] A){
        int[] counter = new int[A.length];
        for (int i:A ){
            try {
                counter[i-1]++;
            } catch (ArrayIndexOutOfBoundsException e){
                return 0;
            }

        }
        for (int j:counter){
            if (j != 1){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] A = {1};
        System.out.println(solution(A));
    }
}
