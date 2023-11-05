public class stackUnitTest {

    public static void main(String args[]) {
        myStack stack1 = new myStack();
        stack1.push("location 1");
        stack1.push("location 2");
        stack1.push("location 3");
        stack1.push("location 4");
        stack1.top();
        System.out.println("Element popped is " + stack1.pop());
        System.out.println("The size of the stack currently is " + stack1.size());
        System.out.println("The stack is not empty because myStack.isEmpty() returns " + stack1.isEmpty());
        stack1.clear();

    }
}