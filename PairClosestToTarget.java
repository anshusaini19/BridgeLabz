import java.util.*;
public class PairClosestToTarget {
    public static void closestPair(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int minDiff = Integer.MAX_VALUE;
        int first = 0;
        int second = 0;
        while (left < right) {
            int sum = nums[left] + nums[right];
            int diff = Math.abs(target - sum);
            if (diff < minDiff) {
                minDiff = diff;
                first = nums[left];
                second = nums[right];
        }
        if (sum < target)left++;
        else{
            right--;
        }
    }
    System.out.println(first + " " + second);
    }
    public static void main(String[] args) {
        int[] nums = {10,22,28,29,30,40};
        closestPair(nums,54);
    }
}
