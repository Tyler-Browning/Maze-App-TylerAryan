import java.io.File;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class myStack<T> implements StackADT<T> {
    
    ArrayList<T> stack;

    public myStack() {
        stack = new ArrayList<>();
    }
    public void push(T item) {
        stack.add(item);
    }

    /**
     * Remove the top item from the stack
     * @return the top item in the stack
     * @throws NoSuchElementException if the stack is empty
     */
    public T pop() {
        if (stack.isEmpty()) {
            throw new NoSuchElementException();
        }
        else {
            T element = stack.get(0);
            stack.remove(0);
            return element;
        }
    } 
    

    /**
     * Display the top item from the stack without removing it
     * @return the top item in the stack
     * @throws NoSuchElementException if the stack is empty
     */
    public T top() {
        if (stack.isEmpty()) {
            throw new NoSuchElementException();
        }
        else {
            return stack.get(0);
        }
    }

    /**
     * Find how many items are in the stack
     * @return the number of items in the stack
     */
    public int size() {
        return stack.size();
    }

    /**
     * Determine if the stack is empty
     * @return true if the size is 0, false otherwise
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /**
     * Clear out the data structure
     */
    public void clear() {
        stack.clear();
    }

}