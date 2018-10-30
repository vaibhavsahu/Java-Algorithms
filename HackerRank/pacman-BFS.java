import java.io.*;
import java.util.*;

class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object other) {
        if(this == other) return false;
        if(!(other instanceof Point)) return false;
        Point thatPoint = (Point)other;
        return this.x == thatPoint.x && this.y == thatPoint.y;
    }
}

//UP(i, j) -> (i-1, j)
//DOWN(i, j) -> (i+1, j)
//LEFT(i, j) -> (i, j-1)
//DOWN(i, j) -> (i, j+1)

public class Main {

    public static boolean inRange(int i, int j, char [][] matrix){
        if(i < 0 || i > matrix.length || j < 0 || j > matrix[0].length){
            return false;
        }
        return true;
    }


    public static ArrayList<Point> getNeighbors(Point point, char [][] matrix, boolean [][] visited, int [][] distanceMatrix){
        ArrayList<Point> list = new ArrayList<>();
        if (inRange(point.x - 1, point.y, matrix) && matrix[point.x - 1][point.y] != '%' && !visited[point.x - 1][point.y]) { //UP
            list.add(new Point(point.x - 1, point.y));
            distanceMatrix[point.x - 1][point.y] = distanceMatrix[point.x][point.y] + 1;
        }
        
        if (inRange(point.x + 1, point.y, matrix) && matrix[point.x + 1][point.y] != '%' && !visited[point.x + 1][point.y]) { //DOWN
            list.add(new Point(point.x + 1, point.y));
            distanceMatrix[point.x + 1][point.y] = distanceMatrix[point.x][point.y] + 1;
        }
        
        if (inRange(point.x, point.y - 1, matrix) && matrix[point.x][point.y - 1] != '%' && !visited[point.x][point.y-1]) { //LEFT
            list.add(new Point(point.x, point.y - 1));
            distanceMatrix[point.x][point.y - 1] = distanceMatrix[point.x][point.y] + 1;
        }
        
        if (inRange(point.x, point.y + 1, matrix) && matrix[point.x][point.y + 1] != '%' && !visited[point.x][point.y+1]) { //DOWN
            list.add(new Point(point.x, point.y + 1));
            distanceMatrix[point.x][point.y + 1] = distanceMatrix[point.x][point.y] + 1;
        }
        
        return list;
    }

    public static int BFS(Point source, Point destination, char [][] matrix, int [][] distanceMatrix) {

        LinkedList<Point> queue = new LinkedList();
        boolean [][] visited = new boolean[matrix.length][matrix[0].length];

        queue.add(source);


        while (!queue.isEmpty()) {
            Point node = queue.remove();

            if (node.equals(destination)) {
                return distanceMatrix[node.x][node.y];
            }
            visited[node.x][node.y] = true;

            //neighbor list
            ArrayList<Point> neighbors = getNeighbors(node, matrix, visited, distanceMatrix);

            for (Point p : neighbors) {
                if (!visited[p.x][p.y]) {
                    visited[p.x][p.y] = true;
                    queue.add(p);
                }
            }
        }
        return -1;
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

        int [][]distanceMatrix = new int[matrix.length][matrix[0].length];
        int pathlength = BFS(source, destination, matrix, distanceMatrix);
        System.out.println(pathlength);
        
    }
}
