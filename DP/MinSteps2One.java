
public class Solution {

    public static int minSteps(int n){
        int [] result = new int[n+1];
        result[0] = 0;
        if(n == 1){
            return 0;
        }

        if(result[n] != 0){
            return result[n];
        }

        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int c = Integer.MAX_VALUE;

        if(n % 2 == 0){
            a = minSteps(n/2);
        }

        if(n % 3 == 0){
            b = minSteps(n/3);
        }

        c = minSteps(n-1);
        return Math.min(a, Math.min(b, c))+1;
    }

    public static void main(String[] args) {
        System.out.println(minSteps(10));
    }
}
