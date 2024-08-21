package Algorithms;


// LIFO on the call stack
public class Recursion {

    public static void main(String[] args)
    {
        walk(5);
    }

    private static void walk(int steps)
    {

        if (steps < 1) return; //base case
        System.out.println("You take a step!");
        walk(steps - 1); // recursive case

    }

}
