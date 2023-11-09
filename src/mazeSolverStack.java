public class mazeSolverStack extends mazeSolver 
{
    myStack<square> worklist;

    public mazeSolverStack(maze m)
    {
        super(m);
        worklist = new myStack<>();
        worklist.push(m.getStart());
    }

    public void makeEmpty()
    {
        worklist = new myStack<>();
    }

    public boolean isEmpty()
    {
        return worklist == null;
    }

    public void add(square sq)
    {
        worklist.push(sq);
    }

    public square next()
    {
        return worklist.pop();
    }
}