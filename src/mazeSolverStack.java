public class mazeSolverStack extends mazeSolver 
{
    myStack<Square> worklist;

    public mazeSolverQueue(maze m)
    {
        super(m);
    }

    public void makeEmpty()
    {
        worklist = new myStack<>();
    }

    public boolean isEmpty()
    {
        return worklist.isEmpty();
    }

    public void add(Square sq)
    {
        worklist.push(sq);
    }

    public Square next()
    {
        return worklist.pop();
    }
}