public class mazeSolverQueue extends mazeSolver 
{
    myQueue<Square> worklist;

    public mazeSolverQueue(maze m)
    {
        super(m);
    }

    public void makeEmpty()
    {
        worklist = new myQueue<>();
    }

    public boolean isEmpty()
    {
        return worklist.isEmpty();
    }

    public void add(Square sq)
    {
        worklist.enqueue(sq);
    }

    public Square next()
    {
        return worklist.dequeue();
    }
}