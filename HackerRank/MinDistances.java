import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumDistances function below.
    static int minimumDistances(int[] arr) {
        Map<Integer, Integer> hm = new HashMap<>();
        int minDist = Integer.MAX_VALUE;
            for(int i=0; i < arr.length; i++){
        //arr[i] = in.nextInt();
        if(hm.containsKey(arr[i])) {
            int x=hm.get(arr[i]);
            int dist = i - x;
            if(dist < minDist) minDist = dist;
        }
        else hm.put(arr[i],i);            
    }
    if(minDist == Integer.MAX_VALUE) minDist=-1;
        return minDist;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
