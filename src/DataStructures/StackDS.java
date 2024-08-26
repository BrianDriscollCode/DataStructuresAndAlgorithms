package DataStructures;

import java.util.Stack;

public class StackDS
{
    public static void main(String[] args)
    {
        // stack = LIFO data structure. Last-In First-Out
        //         stores objects into a sort of "vertical tower"
        //         push() to add to the top
        //         pop() to remove from the top

        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Borderlands");
        stack.push("FFVII");

        System.out.println("Top of the stack: " + stack.peek());
        System.out.println("Stack contents: " + stack);
        System.out.println("Popped: " + stack.pop());

        // Uncomment to test stack operations
        // String myFavGame = stack.pop();
        System.out.println("Top of the stack: " + stack.peek());
        System.out.println("Position of 'Minecraft': " + stack.search("Minecraft"));
        System.out.println("Stack contents: " + stack);

        // Uses of stacks:
        // 1. Undo/redo features in text editors
        // 2. Moving back/forward through browser history
        // 3. Backtracking algorithms (maze, file directories)
        // 4. Calling functions (call stack)
    }
}