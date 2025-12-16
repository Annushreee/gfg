class Solution {
    int missingNum(int arr[]) {
        int n = arr.length;

        long expectedSum = (long)(n + 1) * (n + 2) / 2;
        long actualSum = 0;

        for (int i = 0; i < n; i++) {
            actualSum += arr[i];
        }

        return (int)(expectedSum - actualSum);
    }
}
