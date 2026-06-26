class Solution {
    public void updateArray(int[] arr) {
        // code here
        int n = arr.length;
        if (n == 1) {
            arr[0] = arr[0];
            return;
        }
        int prev = arr[0];
        
        arr[0] = arr[0]*arr[1];
        
        for(int i = 1; i < n-1 ;i++){
            int cur = arr[i];
            arr[i] = prev*arr[i]*arr[i+1];
            prev = cur;
        }
        
        arr[n-1] = prev*arr[n-1];
    }
}