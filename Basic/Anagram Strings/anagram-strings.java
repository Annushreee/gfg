//{ Driver Code Starts
// Initial template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S1 = read.readLine();
            String S2 = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.areAnagram(S1, S2));
        }
    }
}
// } Driver Code Ends


// User function template for Java
class Solution {
    static int areAnagram(String S1, String S2) {
        // code here
        if(S1.length()!=S2.length()) //length same Nhi hai
        {
            return 0;
        }
        char[]arr1=S1.toCharArray(); /*arr1 will contain the characters of the string S1*/
        char[]arr2=S2.toCharArray();                              /*, with each character occupying a */
                                      /* separate element in the array*/
        Arrays.sort(arr1); //arr1) in ascending order
        Arrays.sort(arr2);
        
        for(int i=0;i<S1.length();i++)
        {
            if(arr1[i]!=arr2[i])
            {
                return 0;
            }
        }
        
        return 1;
    }
}