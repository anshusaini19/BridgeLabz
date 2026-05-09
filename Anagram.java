/*
---------------------------------------------------------
Program: Check Whether Two Strings are Anagrams
---------------------------------------------------------

Problem Statement:
Check whether two strings are anagrams or not.

Example:
Input:
listen
silent

Output:
Strings are Anagrams

---------------------------------------------------------
What I Learned From This Program
---------------------------------------------------------

1. How to use frequency arrays in Java.
2. How character counting helps compare strings efficiently.
3. Importance of taking proper user input using Scanner.
4. Learned how to use charAt() and ASCII indexing.
5. Understood why return statements are useful for early exit.
6. Learned debugging of syntax and logical mistakes.

---------------------------------------------------------
Mistakes I Made Initially
---------------------------------------------------------

1. Forgot to take input from user.
   My incorrect code:
   String str1 = new String();
   String str2 = new String();

   Problem:
   Empty strings were created instead of taking input.

   Correct code:
   String str1 = sc.nextLine().toLowerCase();
   String str2 = sc.nextLine().toLowerCase();

---------------------------------------------------------

2. Wrong array declaration.

   My incorrect code:
   int[] freq = new freq[26];

   Problem:
   "freq" is not a datatype.

   Correct code:
   int[] freq = new int[26];

---------------------------------------------------------

3. Wrong variable used inside loop.

   My incorrect code:
   if(n != 0)

   Problem:
   Variable "n" was not defined.

   Correct code:
   if(x != 0)

---------------------------------------------------------

4. Printing result inside loop.

   Problem:
   "Strings are Anagrams" was printing multiple times.

   Fix:
   Print final result only after checking entire frequency array.

---------------------------------------------------------

5. Learned importance of returning after mismatch.

   Correct logic:
   if mismatch found:
       print not anagram
       return

---------------------------------------------------------
Approach Used
---------------------------------------------------------

1. First check string lengths.
2. Create frequency array of size 26.
3. Increment frequency for first string.
4. Decrement frequency for second string.
5. If all frequencies become 0 → Anagram.
6. Else → Not Anagram.

Time Complexity:
O(n)

Space Complexity:
O(1)

---------------------------------------------------------
Correct Code
---------------------------------------------------------
*/

import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        String str1 = sc.nextLine().toLowerCase();
        String str2 = sc.nextLine().toLowerCase();

        // Checking length first
        if (str1.length() != str2.length()) {
            System.out.println("Strings are not Anagrams");
            return;
        }

        // Frequency array for alphabets
        int[] freq = new int[26];

        // Increment frequency for first string
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
        }

        // Decrement frequency for second string
        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i) - 'a']--;
        }

        // Checking if all frequencies are 0
        for (int x : freq) {

            if (x != 0) {
                System.out.println("Strings are not Anagrams");
                return;
            }
        }

        System.out.println("Strings are Anagrams");
    }
}
