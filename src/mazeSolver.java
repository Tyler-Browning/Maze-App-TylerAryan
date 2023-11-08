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

        ArrayList <square> neighbors;
        if(!(this.isEmpty())) {
            square next = this.next();
        
            if(next.getType() == 3) {
                Stack<square> p = new Stack<>();
                square iterator = next;

                while(iterator.getPrevious().getType() != 2) {
                    p.push(iterator.getPrevious());
                    iterator = iterator.getPrevious();
                }

                StringBuilder sb = new StringBuilder();
                Square temporary;

                while(!(p.isEmpty())) {
                    temporary = p.pop();
                    temporary.setType(6);

                    sb.append("[" + temp.getRow() + "," + temp.getCol() + "]");
                }

                solution = new String(sb);

                return next;

            }
            
            neighbors = maze.getNeighbors(next);

            for(square s: neighbors) {
                if (s.getType() == 0) {
                    s.setPrevious(next);
                    s.setType(4);
                    this.add(s);
                }
                else if (s.getType() == 3) {
                    s.setPrevious(next);
                    this.add(s);
                }
            }

            if(next.getType() == 4) {
                current.setType(5);
            }
        }
        return next;
    }

    public void solve() {
        while(!(this.isSolved())) {
            step();
        }
        this.maze.reset();
    }
}
