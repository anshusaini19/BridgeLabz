import java.util.*;

public class topk {

    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[k];

        // Find top k frequent elements
        for (int i = 0; i < k; i++) {

            int maxFreq = 0;
            int maxEle = 0;

            for (int key : map.keySet()) {
                if (map.get(key) > maxFreq) {
                    maxFreq = map.get(key);
                    maxEle = key;
                }
            }

            result[i] = maxEle;
            map.remove(maxEle);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3};

        int[] ans = topKFrequent(nums, 2);

        System.out.println(Arrays.toString(ans));
    }
}