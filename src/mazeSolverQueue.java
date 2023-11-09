public class mazeSolverQueue extends mazeSolver 
{
    myQueue<square> worklist;

    public mazeSolverQueue(maze m)
    {
        super(m);
        worklist = new myQueue<>();
        worklist.enqueue(m.getStart());
    }

    public void makeEmpty()
    {
        worklist = new myQueue<>();
    }

    public boolean isEmpty()
    {
        return worklist == null;
    }

    public void add(square sq)
    {
        worklist.enqueue(sq);
    }

    public square next()
    {
        return (square) worklist.dequeue();
    }
}