//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
          String ps =S.replace("."," ");
        String[] split = ps.split(" ");
        /*The split() method
        of String values takes a pattern and divides this string into
        an ordered list of substrings by searching for the pattern, 
        puts these substrings into an array, and returns the array*/
        
        String rev=""; //new string
        
        for(int i=split.length-1;i>=0;i--)
        {   
            
            rev+=split[i];
            if(i==0){
                
            }
            else
             rev=rev+".";
        }
    
        return rev;
}

}