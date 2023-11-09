import java.io.File;

public class square 
{
    private int row;
    private int col;
    private int type;
    public square previous;

    public square(int row, int col, int type)
    {
        this.row = row;
        this.col = col;
        this.type = type;
        this.previous = null;
    }

    public int getRow()
    {
        return row;
    }

    public int getCol()
    {
        return col;
    }

    public int getType()
    {
        return type;
    }

    public square getPrevious() {
        return previous;
    }

    public void setPrevious(square previous) {
        this.previous = previous;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String toString() 
    {
        switch(type) 
        {
            case 0:
                return "_";
            case 1:
                return "#";
            case 2:
                return "S";
            case 3:
                return "E";
            case 4:
                return "o";
            case 5:
                return ".";
            case 6:
                return "x";
            default:
                return "-1";    
        }
    }
}
