public class backtrackMaze {

    // numer of ways
    public static int numWays(int sr, int sc, int er, int ec) {
        if(sr>er || sc>ec) return 0;
        if(sr==er && sc == ec) return 1;
        int downWays = numWays(sr+1, sc, er, ec);
        int rigthWays = numWays(sr, sc+1, er, ec);
        int totalWays = downWays + rigthWays;
        return totalWays;
    }

    // print the path
    public static void printPath(int sr, int sc, int er, int ec, String s) {
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec) {
            System.out.println(s);
            return;
        }
        // go down
        printPath(sr+1, sc, er, ec, s+"D");

        // go right
        printPath(sr, sc+1, er, ec, s+"R");

    }


    // path in 4 directions
    public static void fourWays(int sr, int sc, int er, int ec, String s, boolean[][] isVisited) {
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(isVisited[sr][sc]==true) return;
        if(sr==er && sc==ec) {
            System.out.println(s);
            return;
        }
        

        isVisited[sr][sc] = true;
        // down
        fourWays(sr+1, sc, er, ec, s+"D", isVisited);
        // right
        fourWays(sr, sc+1, er, ec, s+"R", isVisited);
        // left
        fourWays(sr, sc-1, er, ec, s+"L", isVisited);
        // up
        fourWays(sr-1, sc, er, ec, s+"D", isVisited);

        isVisited[sr][sc] = false;

    }

    // path in dead maze R D
    public static void deadMaze(int sr, int sc, int er, int ec, String s, int[][] maze) {
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec) {
            System.out.println(s);
            return;
        }
        if(maze[sr][sc]==0) return;
        // right
        deadMaze(sr, sc+1, er, ec, s+"R", maze);
        // down
        deadMaze(sr+1, sc, er, ec, s+"D", maze);
    }

    public static void deadMazeAllDir(int sr, int sc, int er, int ec, String s, int[][] maze, boolean[][] isVisited ) {
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec) {
            System.out.println(s);
            return;
        }

        if(maze[sr][sc]==0) return;

        if(isVisited[sr][sc]==true) return;


        isVisited[sr][sc] = true;

        // right
        deadMazeAllDir(sr, sc+1, er, ec, s+"R", maze, isVisited);
        deadMazeAllDir(sr, sc-1, er, ec, s+"L", maze, isVisited);
        deadMazeAllDir(sr+1, sc, er, ec, s+"D", maze, isVisited);
        deadMazeAllDir(sr-1, sc, er, ec, s+"U", maze, isVisited);

        isVisited[sr][sc] = false;





    }



    public static void main(String[] args) {

        int rows = 3;
        int column = 3;

        // int count = numWays(0,0,rows-1,column-1);
        // System.out.println(count);

        // printPath(0, 0, rows-1, column-1, "");
        // System.out.println();

         boolean[][] isVisited = new boolean[rows][column];
        // fourWays(0, 0, rows-1, column-1,"", isVisited);  


        
        // dead maze
        int[][] maze = {
                        {1,1,1},
                        {1,1,1},
                        {0,1,1}
        };

        // deadMaze(0, 0, rows-1, column-1, "", maze);

        // all directition dead maze
        deadMazeAllDir(0, 0, rows-1, column-1, "", maze, isVisited);

    }
}
