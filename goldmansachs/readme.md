--

Your previous Plain Text content is preserved below:

 Problem Name is &&& Optimal Path &&& PLEASE DO NOT REMOVE THIS LINE. */


 Instructions to candidate.
**  1) You are an avid rock collector who lives in southern California. Some rare 
**     and desirable rocks just became available in New York, so you are planning 
**     a cross-country road trip. There are several other rare rocks that you could 
**     pick up along the way. 
**     
**     You have been given a grid filled with numbers, representing the number of 
**     rare rocks available in various cities across the country.  Your objective 
**     is to find the optimal path from So_Cal to New_York that would allow you to 
**     accumulate the most rocks along the way. 
**     
**     Note: You can only travel either north (up) or east (right).


**  2) Consider adding some additional tests in doTestsPass().


**  3) Implement optimalPath() correctly.


**  4) Here is an example:
**                                                           ^
**                 {{0,0,0,0,5}, New_York (finish)           N
**                  {0,1,1,1,0},                         < W   E >
**   So_Cal (start) {2,0,0,0,0}}                             S
**                                                           v 
**   The total for this example would be 10 (2+0+1+1+1+0+5).
*/
import java.io.*;
import java.util.*;
// (i, j) - > E -> (i, j+1)
//(i, j) -> N -> (i-1, j)
//2 -> (0, 0) -> (1, 0) -> choose max out of left subtree or right subtree, whichever
// is max, follow along that subtree path
//  2
// 0 0 //decide tie
class Solution
{
/*
**  Find the optimal path.
*/
 
     public static boolean isValidPosition(Integer [][] arr, int i , int j){
        if(i < arr.length && i >= 0 && j < arr.length && j >= 0 ){
            return true;
        }
       return false; 
      }

      public static Integer optimalPath(Integer[][] grid)
      {
        int count = 0;

        boolean [][] visited = new boolean[grid.length][grid[0].length];
        for(int i = grid.length - 1; i >= 0; i--){

          for(int j = 0; j < grid[0].length; j++){

            //System.out.println(i + " " + j);

            if(!visited[i][j] && isValidPosition(grid, i, j+1) &&  isValidPosition(grid, i-1, j)){

