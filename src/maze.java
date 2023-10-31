import java.util.*;
import java.io.*;

class maze
{
    public Square[][]  squares;

    
    private Square start;
    private Square finish;
    private String current = null;


    
    public Maze(){
    }

    public boolean loadMaze(String fname) throws FileNotFoundException
    {
        boolean tf = false;

        File file;
        try
        {
            file = new File(fname);
        }
        catch(Exception e)
        {
            System.out.println("There was a problem loading the maze file");
            throw new FileNotFoundException();
        }

        Scanner scan = new Scanner(file);
        String[] dimension = scan.nextLine().split(" ");
        int numRows = Integer.parseInt(dimension[0]);
        int numCols = Integer.parseInt(dimension[1]);
        squares = new Square[numRows][numCols];


        
        for (int row = 0; row < numRows; row++)
        {            
            String[] s = scan.nextLine().split(" ");
            for (int col = 0; col < numCols; col++)
            {
                squares[row][col] = new Square(row, col, Integer.parseInt(s[col]));
                
                if (squares[row][col].getType() == 2)
                    start = squares[row][col];
                else if (squares[row][col].getType() == 3)
                    finish = squares[row][col];
            }
        }
        tf = true;
        return tf;
    }



    
    public ArrayList<Square> getNeighbors(Square sq)
    {
        ArrayList<Square> neighbors = new ArrayList<Square>();

        if(sq.getRow() != 0) neighbors.add(squares[sq.getRow() - 1][sq.getCol()]);
        
        if(sq.getRow() != squares.length - 1) neighbors.add(squares[sq.getRow() + 1][sq.getCol()]);
        
        if(sq.getCol() != 0) neighbors.add(squares[sq.getRow()][sq.getCol() - 1]);
        
        if(sq.getCol() != squares[0].length - 1) neighbors.add(squares[sq.getRow()][sq.getCol() + 1]);

        return neighbors;
    }



    
    public Square getStart()
    {
        return start;
    }

    
    public Square getFinish()
    {
        return finish;
    }

    
    public void reset() throws FileNotFoundException
    {
        if (current != null) loadMaze(current);
    }

    
    public String toString()
    {
        String string = "";
        for (Square[] row: squares)
        {
            for (Square square: row)
            {
                string += square + " ";
            }
            string += "\n";
        }

        return string;
    }

}
