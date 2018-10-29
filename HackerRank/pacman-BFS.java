class Point{
    int x;
    int y;
    //int dist;
    Point(int x, int y){
        this.x = x;
        this.y = y;
        //this.dist = 0;
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


    public static int BFS(Point source, Point destination, char [][] matrix) {

        LinkedList<Point> queue = new LinkedList();
        boolean [][] visited = new boolean[matrix.length][matrix[0].length];

        queue.add(source);
        int pathLength = 0;

        while (!queue.isEmpty()) {
            Point node = queue.remove();
            if (node.equals(destination)) {
                System.out.println("path found");
                return pathLength;
            }
            visited[node.x][node.y] = true;

            //neighbor list
            ArrayList<Point> neighbors = new ArrayList();
            if (inRange(node.x - 1, node.y, matrix) && matrix[node.x - 1][node.y] != '%' && !visited[node.x - 1][node.y]) { //UP
                neighbors.add(new Point(node.x - 1, node.y));
            }
            if (inRange(node.x + 1, node.y, matrix) && matrix[node.x + 1][node.y] != '%' && !visited[node.x + 1][node.y]) { //DOWN
                neighbors.add(new Point(node.x + 1, node.y));
                //System.out.println("i: " + (node.x + 1) + ", "+ "j: " + node.y);
            }
            if (inRange(node.x, node.y - 1, matrix) && matrix[node.x][node.y - 1] != '%' && !visited[node.x][node.y-1]) { //LEFT
                neighbors.add(new Point(node.x, node.y - 1));
            }
            if (inRange(node.x, node.y + 1, matrix) && matrix[node.x][node.y + 1] != '%' && !visited[node.x][node.y+1]) { //DOWN
                neighbors.add(new Point(node.x, node.y + 1));
            }

            for (Point p : neighbors) {
                if (!visited[p.x][p.y]) {
                    pathLength++;
                    visited[p.x][p.y] = true;
                    queue.add(p);
                }
            }
        }
        return pathLength;
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
