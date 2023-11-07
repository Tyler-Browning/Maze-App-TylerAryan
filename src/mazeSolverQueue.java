public class MazeSolverQueue extends MazeSolver
{
    myQueue<Square> queue;

  
    public MazeSolverQueue(Maze m)
    {
        super(m);
    }

  
    public void makeEmpty()
    {
        queue = new MyQueue<>();
    }

  
    public boolean isEmpty()
    {
      if (queue.isEmpty())
      {
        return true;
      }
      return false;
    }

  
    public void add(Square s)
    {
        queue.enqueue(s);
    }

  
    public Square next()
    {
        return queue.dequeue();
    }
}
