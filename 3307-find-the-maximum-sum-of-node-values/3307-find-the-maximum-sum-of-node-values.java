class Solution 
{
    public long maximumValueSum(int[] nums, int k, int[][] edges) 
    {
        // Step 1: Compute the base sum
        long baseSum = 0;
        List<Integer> gains = new ArrayList<>();

        // Step 2: Compute gain for each node if XORed with k
        for (int num : nums) 
        {
            int xorVal = num ^ k;
            int gain = xorVal - num;
            baseSum += num;
            gains.add(gain);
        }

        // Step 3: Sort gains in descending order
        gains.sort(Collections.reverseOrder());

        // Step 4: Try taking top even number of gains to maximize gain
        long maxGain = 0, currentGain = 0;
        int count = 0;

        for (int g : gains) 
        {
            currentGain += g;
            count++;
        
            // Step 5: Only accept the gain if we have added even number of gains
            if (count % 2 == 0) 
            {
                maxGain = Math.max(maxGain, currentGain);
            }
        }

        return baseSum + maxGain;
    }
}