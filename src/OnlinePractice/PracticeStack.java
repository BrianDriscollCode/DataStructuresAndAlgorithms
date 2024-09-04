package OnlinePractice;

import java.util.Scanner;
import java.util.Stack;

public class PracticeStack {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean userIsTyping = true;
        Stack<String> words = new Stack<>();

        System.out.println("Type in random words to add to the stack. Type 'exit' to exit. ");

        // Adding words to the stack
        while (userIsTyping)
        {
            String enteredWord = input.nextLine();

            if (enteredWord.equalsIgnoreCase("exit"))
            {
                userIsTyping = false;
            }
            else
            {
                words.push(enteredWord);
                System.out.println(words);
            }
        }

        userIsTyping = true;
        int removalAmount = 0;

        // choose a number and remove that many elements from the stack
        while (userIsTyping)
        {
            System.out.println("You have " + words.size() + " words in the stack. Enter in how many words to remove. Any number above " + words.size() + " will result in error." );

            int numberToRemove = input.nextInt();

            if (numberToRemove > words.size())
            {
                System.out.println("That's too much, try again!");
            }
            else
            {
                removalAmount = numberToRemove - 1;
                userIsTyping = false;
            }
        }

        for (int i = 0; i <= removalAmount; i++)
        {
            words.pop();
        }

        System.out.println("The words left in the stack: " + words);
    }
}
