import java.io.*;
import java.util.*;

public class Solution {
   /* ArrayDeque is faster than tha stack when used as stack and faster than the linked list when used as queue
     /* Stack - using an ArrayDeque */
     ArrayDeque<Character> dequeAsStack = new ArrayDeque();
     
     void pushCharacter(char c)
     {
         dequeAsStack.push(c);
     }
     
     char popCharacter()
     {
         return dequeAsStack.pop();
     }
     
     /* queue - using an ArrayDeque */
     ArrayDeque<Character> dequeAsQueue = new ArrayDeque();
     
     void enqueueCharacter(char c)
     {
         dequeAsQueue.add(c);
     }

     char dequeueCharacter()
     {
         return dequeAsQueue.remove();
     }
    



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
