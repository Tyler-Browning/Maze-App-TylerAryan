import java.util.*;

public abstract class mazeSolver 
{
    private maze m;
    private String solution;

    public mazeSolver(maze m) {
        this.m = m;
        
    }

    abstract void makeEmpty();

    abstract boolean isEmpty();

    abstract void add(square sq);

    abstract square next();

    public boolean isSolved() {
        return solution != null || this.isEmpty();
    }

    public String getPath() {
        if (solution == null) {
            return "There is no solution to this maze";
        }

        return solution;


    }

    public square step() {
        if(!(this.isEmpty())) {
            square next = this.next();
        
        }
    }
    

    

    
}
