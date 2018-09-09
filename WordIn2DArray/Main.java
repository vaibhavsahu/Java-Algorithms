package com.vaibhav.interview;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       //word - ronak
        char [][] puzzle = {{'k','x', 'x', 'x', 'x' },
                            {'x','a', 'x', 'x', 'x' },
                            {'x','x', 'n', 'x', 'x' },
                            {'x','x', 'x', 'o', 'x' },
                            {'x','x', 'x', 'x', 'r' }};

        Date d1 = null;
        Date d2 = null;
        int  nrows = puzzle.length;
        int ncols = puzzle[0].length;
        char [] word = "ronak".toCharArray();
        long startTime = System.currentTimeMillis();
        Position result = Position.match2D(puzzle, nrows, ncols, word);
        long endTime   = System.currentTimeMillis();
        System.out.println(endTime-startTime);
        if(result == null){
            System.out.println("No Match");
        }else{
            System.out.printf("%s found at (%d, %d) in direction %s\n",
                       word, result.row, result.col,
                        Direction.name(result.dir) );
        }

    }
}





