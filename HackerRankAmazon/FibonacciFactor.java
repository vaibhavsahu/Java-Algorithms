import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static long [] Fibonacci(int n){
        int limit = 100;
        long [] fibArray = new long[100];
        //int limit = 100;
        fibArray[0] = 0;
        fibArray[1] = 1;
        //create the Fibonacci series and store it in an array
        for(int i=2; i < limit; i++){
                fibArray[i] = fibArray[i-1] + fibArray[i-2];
        }
        return fibArray;
    }

    /*
    * returns a prime factor except 1
    *
    * */
    public static Set<Integer> getSmallestPrimeFactor(int n){
        Set<Integer> primeSet = new LinkedHashSet<>();

        for (int i = 2; i <= n; i++)
        {
            // While i divides n, print i and divide n
            while (n%i == 0)
            {
                primeSet.add(i);
                 n /= i;
            }
        }
        return primeSet;
    }

    public static long getSmallestCommonFibonacciFactor(long [] arr, Set<Integer> set){
        long result = 0;
        int minFactor = (int)Collections.min(set);
        for(int i = 2; i < arr.length; i++){
            if(arr[i]%minFactor == 0 ){
                result = arr[i];
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num_of_test_cases = sc.nextInt();

        for(int i = 0; i < num_of_test_cases; i++){
            int number = sc.nextInt();
            long [] fibonacciList = Fibonacci(number);

            Set<Integer> primeFactorSet = getSmallestPrimeFactor(number);

            long result = getSmallestCommonFibonacciFactor(fibonacciList, primeFactorSet);
            System.out.println(result+" "+(int)Collections.min(primeFactorSet));
        }
    }
}
