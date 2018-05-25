long getMaximumSubarraySum(int[] a) {
    int start = 0; 
    int end = 0;
    long result = 0; // I assume that an empty subarray is allowed.
    long minPrefixSum = 0;
    int minPrefixSumPos = -1;
    long currentPrefixSum = 0;
    for (int i = 0; i < a.length; i++) {
        currentPrefixSum += a[i];
        if (currentPrefixSum - minPrefixSum > result) {
             result = currentPrefixSum - minPrefixSum;
             start = minPrefixSumPos + 1;
             end = i + 1;
        }
        if (currentPrefixSum < minPrefixSum) {
             minPrefixSum = currentPrefixSum;
             minPrefixSumPos = i;
        }
    }
    // The resulting subarray is [start; end).
    return result;
}