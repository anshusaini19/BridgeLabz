/*  Problem: Longest consecutive sequence
You are given an unsorted integer array.
Your task is to find the length of the longest sequence of consecutive numbers.
Consecutive numbers are numbers that follow each other continuously:
1,2,3,4
or
10,11,12
The elements can appear in any order inside the array.
You must solve the problem in:
O(n)
time complexity.


Example 1
Input
nums = [100,4,200,1,3,2]

Output
4


Explanation
Longest consecutive sequence:
1,2,3,4
Length:
4


Example 2
Input
nums = [0,3,7,2,5,8,4,6,0,1]

Output
9*/

import java.util.HashSet;

public class LongestConsSeq {

    // Method to find longest consecutive sequence
    public static int longestConsecutive(int[] nums) {

        // Store all numbers in HashSet
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Traverse through set
        for (int num : set) {

            // Start only if previous number does not exist
            if (!set.contains(num - 1)) {

                int currNum = num;
                int count = 1;

                // Check consecutive numbers
                while (set.contains(currNum + 1)) {

                    currNum++;
                    count++;
                }

                // Update longest sequence
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};

        int result = longestConsecutive(nums);

        System.out.println(
                "Longest Consecutive Sequence Length = "
                        + result
        );
    }
}

// Key optimization learned:
// Start sequence only when previous number
// does not exist.
// Important logic:
//if (!set.contains(num - 1))


// This avoids unnecessary traversals
// and gives O(n) time complexity.


