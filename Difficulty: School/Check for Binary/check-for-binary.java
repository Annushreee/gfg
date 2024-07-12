//{ Driver Code Starts
import java.util.*;


class checkBinary
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T>0)
		{
			String str = sc.nextLine();
			GfG g = new GfG();
			boolean b = g.isBinary(str);
			if(b== true)
				System.out.println(1);
			else
			    System.out.println(0);
		T--;
		}
	}
}


// } Driver Code Ends


class GfG {
    boolean isBinary(String str) {
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Check if the character is not '0' or '1'
            if (str.charAt(i) != '0' && str.charAt(i) != '1') {
                return false; // Return false if any character is not '0' or '1'
            }
        }
        // If all characters are '0' or '1', return true
        return true;
    }
}