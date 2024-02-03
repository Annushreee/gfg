//{ Driver Code Starts
import java.util.*;
import java.util.stream.*; 
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        String m=a.toLowerCase();
        String n=b.toLowerCase();
        
        if(m.length()==n.length())
        {
            //now converting string to char array
            char[] charArray1=m.toCharArray();
            char[] charArray2=n.toCharArray();
            //sorting the char array
            Arrays.sort(charArray1);
             Arrays.sort(charArray2);
             
             
             
             if(Arrays.equals(charArray1,charArray2))
             {
                 return true;
             }
             else
             {
                 return false;
             }
            
           
        }
         return false;
    }
}