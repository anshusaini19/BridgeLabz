public class SubarraySumK {

    public static int subarray(int[] nums, int k) {

        // Stores the number of valid subarrays
        int count = 0;

        // Pick every index as starting point
        for (int i = 0; i < nums.length; i++) {

            // Sum of current subarray
            int sum = 0;

            // Extend subarray from i to end
            for (int j = i; j < nums.length; j++) {

                // Add current element
                sum += nums[j];

                // Check if sum equals k
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
        /*optimized code
        // Stores prefixSum -> frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // Important:
        // Sum 0 has occurred once before starting
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {

            // Update running sum
            prefixSum += num;

            // Check if (prefixSum - k) exists
            if (map.containsKey(prefixSum - k)) {

                // Add its frequency to count
                count += map.get(prefixSum - k);
            }

            // Store current prefix sum
            map.put(prefixSum,
                    map.getOrDefault(prefixSum, 0) + 1);
        }

        return count; */
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 1};
        int k = 3;

        System.out.println(subarray(nums, k));
    }
}