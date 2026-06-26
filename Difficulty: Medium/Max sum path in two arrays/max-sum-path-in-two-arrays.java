class Solution {
    public int maxPathSum(int[] arr1, int[] arr2) {

        int i = 0, j = 0;
        int sum1 = 0, sum2 = 0;
        int result = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                sum1 += arr1[i];
                i++;
            }
            else if (arr1[i] > arr2[j]) {
                sum2 += arr2[j];
                j++;
            }
            else {
                // Common element
                result += Math.max(sum1, sum2) + arr1[i];

                sum1 = 0;
                sum2 = 0;

                i++;
                j++;
            }
        }

        // Remaining elements
        while (i < arr1.length) {
            sum1 += arr1[i];
            i++;
        }

        while (j < arr2.length) {
            sum2 += arr2[j];
            j++;
        }

        result += Math.max(sum1, sum2);

        return result;
    }
}