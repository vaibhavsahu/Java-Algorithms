package com.vaibhav.interview;

/**
 * Created by vaibh on 9/8/2018.
 */
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