

]
1
/* 
2
Your previous Plain Text content is preserved below:
3
​
4
/* Problem Name is &&& Optimal Path &&& PLEASE DO NOT REMOVE THIS LINE. */
5
​
6
/*
7
** Instructions to candidate.
8
**  1) You are an avid rock collector who lives in southern California. Some rare 
9
**     and desirable rocks just became available in New York, so you are planning 
10
**     a cross-country road trip. There are several other rare rocks that you could 
11
**     pick up along the way. 
12
**     
13
**     You have been given a grid filled with numbers, representing the number of 
14
**     rare rocks available in various cities across the country.  Your objective 
15
**     is to find the optimal path from So_Cal to New_York that would allow you to 
16
**     accumulate the most rocks along the way. 
17
**     
18
**     Note: You can only travel either north (up) or east (right).
19
**  2) Consider adding some additional tests in doTestsPass().
20
**  3) Implement optimalPath() correctly.
21
**  4) Here is an example:
22
**                                                           ^
23
**                 {{0,0,0,0,5}, New_York (finish)           N
24
**                  {0,1,1,1,0},                         < W   E >
25
**   So_Cal (start) {2,0,0,0,0}}                             S
26
**                                                           v 
27
**   The total for this example would be 10 (2+0+1+1+1+0+5).
28
*/
29
​
30
import java.io.*;
31
import java.util.*;
32
​
33
// (i, j) - > E -> (i, j+1)
34
//(i, j) -> N -> (i-1, j)
35
​
36
//2 -> (0, 0) -> (1, 0) -> choose max out of left subtree or right subtree, whichever
37
// is max, follow along that subtree path
38
//  2
39
// 0 0 //decide tie
40
​
41
​
42
​
43
class Solution
44
{
45
  /*
46
  **  Find the optimal path.
47
  
48
  
49
  */
50
  
51
  
52
  
53
  public static boolean isValidPosition(Integer [][] arr, int i , int j){
54
    
55
    if(i < arr.length && i >= 0 && j < arr.length && j >= 0 ){
56
      
57
        return true;
58
    }
59
   return false; 
60
  }
61
  
62
  
63
  
64
  public static Integer optimalPath(Integer[][] grid)
65
  {
66
    
67
    int count = 0;
68
    boolean [][] visited = new boolean[grid.length][grid[0].length];
69
    
70
    for(int i = grid.length - 1; i >= 0; i--){
71
      for(int j = 0; j < grid[0].length; j++){
72
        //System.out.println(i + " " + j);
73
        
74
        if(!visited[i][j] && isValidPosition(grid, i, j+1) &&  isValidPosition(grid, i-1, j)){
Start Call
Goldman Sachsbalaguru.nallathambi
vaibhav sahu
Settings vaibhav sahu
