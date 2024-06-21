//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class GFG {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Solution ob = new Solution();
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str = read.readLine().trim();
            String ans = ob.compareFrac(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    String compareFrac(String str) {
        // Code here

       //Split the string based on a comma or white space.
        String[] arr= str.split("[,\\s]+");
        
            String[] frac = arr[0].split("/");
            int num1=Integer.parseInt(frac[0]);
            int den1=Integer.parseInt(frac[1]);
            
            float ans1=(float)num1/den1;
            
            frac = arr[1].split("/");
            int num2=Integer.parseInt(frac[0]);
            int den2=Integer.parseInt(frac[1]);
            
            float ans2=(float)num2/den2;
            
            if(ans1==ans2){
                return "equal";
            }
        return (ans1>ans2) ? arr[0] : arr[1];
    }
}