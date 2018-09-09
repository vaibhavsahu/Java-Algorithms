package com.vaibhav.interview;

/**
 * Created by vaibh on 9/8/2018.
 */
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
