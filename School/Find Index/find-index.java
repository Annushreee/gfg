//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;




class Array
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0)
	    {
	    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    int key = sc.nextInt();
		    Solution ob=new Solution();
		    int ar[]=ob.findIndex(arr,n,key);
		    System.out.println(ar[0]+" "+ar[1]);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    // Function to find starting and end index 
    static int[] findIndex(int arr[], int n, int key) 
    { 
         int ans[] = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int count=0;

        for(int i=0;i<n;i++){
            if(count==0 && arr[i]==key){
                ans[0]=i;
                count++;
            }
            if(count!=0 && arr[i]==key){
                ans[1] = i;
            }
        }
        return ans;
    }
}