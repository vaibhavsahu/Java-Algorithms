
import java.util.Scanner;

public class WordSearch {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      int nrows = input.nextInt();
      int ncols = input.nextInt();

      char[][] puzzle = new char[nrows][ncols];

      for (int i = 0; i < nrows; i++) {
         String row = input.next();
         for (int j = 0; j < ncols; j++) 
            puzzle[i][j] = row.charAt(j);        
      }

/*
      for (int i = 0; i < nrows; i++) {
         for (int j = 0; j < ncols; j++) 
            System.out.print(puzzle[i][j]);
         System.out.println();
      }
*/

      int nwords = input.nextInt();
      for (int w = 0; w < nwords; w++) {
         String wordAsString = input.next();
         char[] word = wordAsString.toCharArray();

         Position result = match2D(puzzle, nrows, ncols, word);

         if (result == null) 
            System.out.printf("%s not found\n", wordAsString);
         else {
            System.out.printf("%s found at (%d, %d) in direction %s\n",
                              wordAsString, result.row, result.col, 
                              Direction.name(result.dir) );
         }

/*

         for (int k = 0; k < word.length; k++)
            System.out.print(word[k]);
         System.out.println();
*/

      }

   }

   /** performs a 2D-match, searching for word in puzzle.
       returns a corresponding Position object if word is found,
       and null otherwise. */

   public static Position match2D(char[][] puzzle, int nrows, int ncols,
                                  char[] word) {

      for (int i = 0; i < nrows; i++) 
         for (int j = 0; j < ncols; j++) 
            if (puzzle[i][j] == word[0]) {
               Position result = searchAllDirs(puzzle, nrows, ncols, word, i, j);
               if (result != null)
                  return result;
            }

      return null;
   }

   /** performs a 2D-match, searching for word in puzzle in all directions
       from the fixed position (i, j).
       returns a corresponding Position object if word is found,
       and null otherwise. */
   

   public static Position searchAllDirs(char[][] puzzle, int nrows, int ncols,
                                       char[] word, int i, int j) {
   
      for (int dir = 0; dir < Direction.NUM_DIRS; dir++) {
         Position result = searchOneDir(puzzle, nrows, ncols, word, i, j, dir);
         if (result != null) 
            return result;
      }

      return null;
   }

   /** performs a 2D-match, searching for word in puzzle in all directions
       from the fixed position (i, j) and in the given direction dir.
       returns a corresponding Position object if word is found,
       and null otherwise. */

   public static Position searchOneDir(char[][] puzzle, int nrows, int ncols,
                                       char[] word, int i, int j, int dir) {
      
      int i1 = i;
      int j1 = j;
      int k = 0;

      while (k < word.length && inRange(nrows, ncols, i1, j1) && 
             word[k] == puzzle[i1][j1]) {
   
         i1 += Direction.deltaI(dir);
         j1 += Direction.deltaJ(dir);
         k++;
      }

      if (k < word.length) 
         return null;
      else
         return new Position(i, j, dir, word.length);
   }

   /** tests if (i, j) in {0..nrows-1} x {0..ncols-1} */

   public static boolean inRange(int nrows, int ncols, int i, int j) {
      return 0 <= i && i < nrows && 0 <= j && j < ncols;
   }


   
}

/** an object of class Position class records the row, column, direction, 
    and length of a word in a 2D match puzzle. */

class Position {
   public int row;
   public int col;
   public int dir;
   public int len;

   public Position(int row, int col, 
                   int dir, int len) {
      this.row = row;
      this.col = col;
      this.dir = dir;
      this.len = len;
   }
}

/** class Direction provides static constants and functions for
    dealing with directions in a 2D array.

    Field Summary:
    public final static int NUM_DIRS = 8;
      -- not subject to change
      -- directions are encoded as integers 0..NUM_DIRS-1,
         where East is encoded as 0, Northeast is encoded as 1, and so
         on around the compass.

    Constructor Summary:
    There are no constructors - it is not intended that objects of this
       class are created
    

    Method Summary:
        public static int deltaJ(int dir) 
       -- returns the column offset (1, -1, 0) to move one cell
          in given direction
    public static int deltaI(int dir) 
       -- returns the row offset (1, -1, 0) to move one cell
          in given direction
    public static String name(int dir) 
       -- returns the symbolic name of the given direction
   
*/ 

class Direction {
   public final static int NUM_DIRS = 8;

   private final static int[] deltaJVal =
      { 1, 1, 0, -1, -1, -1, 0, 1 };

   private final static int[] deltaIVal = 
      { 0, -1, -1, -1, 0, 1, 1, 1 };

   private final static String[] nameVal = 
      { "E", "NE", "N", "NW", "W", "SW", "S", "SE" };

   public static int deltaJ(int dir) {
      return deltaJVal[dir];
   }

   public static int deltaI(int dir) {
      return deltaIVal[dir];
   }

   public static String name(int dir) {
      return nameVal[dir];
   }
}
      


