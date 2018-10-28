import java.io.*;
import java.util.*;

class Point{
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

//UP(i, j) -> (i-1, j)
//DOWN(i, j) -> (i+1, j)
//LEFT(i, j) -> (i, j-1)
//DOWN(i, j) -> (i, j+1)

public class Solution {
    
    public static boolean inRange(int i, int j, char [][] matrix){
        if(i < matrix.length || i > matrix.length || j < matrix[0].length || j > matrix[0].length){
            return false;
        }
        return true;
    }
    
    
    public static int BFS(Point source, Point destination, char [][] matrix){
        
        LinkedList<Point> queue = new LinkedList();
        HashSet<Point> visited = new HashSet();
        
        queue.add(source);
        
        
        while(!queue.isEmpty()){
            Point node = queue.remove();
            visited.add(node);
            
            //neighbor list
            ArrayList<Point> neighbors = new ArrayList();
            if(inRange(node.x-1, node.y) && matrix[node.x-1][node.y] != '%') //UP
                neighbors.add(new Point(node.x-1, node.y));
            if(inRange(node.x+1, node.y) && matrix[node.x+1][node.y] != '%') //DOWN
                neighbors.add(new Point(node.x+1, node.y));
            if(inRange(node.x, node.y-1) && matrix[node.x][node.y-1] != '%') //LEFT
                neighbors.add(new Point(node.x, node.y-1));
            if(inRange(node.x, node.y+1) && matrix[node.x][node.y+1] != '%') //UP
                neighbors.add(new Point(node.x, node.y+1));
            
            for(Point p : neighbors){
                if(!visited.contains(p)){
                    
                }
            }
            
        }
        
        
        
        
        
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        Point source = new Point(x1, y1);
        Point destination = new Point(x2, y2);
        
        char [][] matrix = new char[rows][cols];
        for(int i = 0; i < rows; i++){
            String line = sc.next();
            matrix[i] = line.toCharArray();
        }
        
        // for(int i = 0; i < rows; i++){
        //     for(int j = 0; j < cols; j++){
        //         System.out.print(matrix[i][j]);
        //     }
        //     System.out.println();
        // }
        
        int pathlength = BFS(source, destination, matrix);
        
    }
}
