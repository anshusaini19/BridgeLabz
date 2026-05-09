/*
---------------------------------------------------------
Program: Move All Zeroes To End of Array
---------------------------------------------------------

Problem Statement:
Move all zero elements to the end of the array
without changing the order of non-zero elements.

Example:

Input:
6
1 0 2 0 4 5

Output:
1 2 4 5 0 0

---------------------------------------------------------
Concepts Used
---------------------------------------------------------

1. Arrays
2. Loops
3. Two Pointer Technique
4. Swapping
5. Input handling using Scanner


---------------------------------------------------------
Mistakes / Confusions I Had Initially
---------------------------------------------------------

1. Incorrect class declaration.

   My incorrect code:
   public static zeroes

   Problem:
   Class keyword was missing.

   Correct code:
   public class Zeroes

---------------------------------------------------------

2. Forgot array declaration.

   Problem:
   Array was used before creating it.

   Correct code:
   int[] arr = new int[n];

---------------------------------------------------------

3. Wrong input syntax.

   My incorrect code:
   arr[i] = sc.next(arr[i]);

   Problem:
   next() is used for strings, not integers.

   Correct code:
   arr[i] = sc.nextInt();

---------------------------------------------------------

4. Variable scope confusion.

   Problem:
   Variable i was used outside loop without declaration.

   Learned:
   Variables declared inside loops are local to that block.

---------------------------------------------------------

5. Initially confused about two-pointer logic.

   Learned:
   Pointer i:
   -> Finds first zero position.

   Pointer j:
   -> Finds next non-zero element.

   Then swapping is performed.

---------------------------------------------------------

6. Learned how order is maintained.

   Example:
   1 0 2 0 4 5

   Non-zero elements remain:
   1 2 4 5

---------------------------------------------------------
Approach Used
---------------------------------------------------------

1. Take array input from user.
2. Find first zero index using pointer i.
3. Use pointer j to search next non-zero element.
4. Swap zero with non-zero value.
5. Continue until end of array.
6. Print updated array.

---------------------------------------------------------
Time Complexity
---------------------------------------------------------

Time Complexity:
O(n)

Space Complexity:
O(1)

---------------------------------------------------------
Correct Code
---------------------------------------------------------
*/

import java.util.Scanner;

public class Zeroes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking size of array
        int n = sc.nextInt();

        // Creating array
        int[] arr = new int[n];

        // Taking array input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Finding first zero
        int i = 0;

        while (i < n && arr[i] != 0) {
            i++;
        }

        // Pointer for next non-zero element
        int j = i + 1;

        while (j < n) {

            // If non-zero element found
            if (arr[j] != 0) {

                // Swapping
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }

            j++;
        }

        // Printing updated array
        System.out.println("Array after moving zeroes:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
