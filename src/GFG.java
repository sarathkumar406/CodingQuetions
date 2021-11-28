// Java program to print all possible
// subStrings of a given String
// without checking for duplication.
import java.io.*;

class GFG{
	
// Function to print all (n * (n + 1)) / 2
// subStrings of a given String s of length n.
public static void printAllSubStrings(String s,
									int n)
{
	
	// Fix start index in outer loop.
	// Reveal new character in inner
	// loop till end of String.
	// Print till-now-formed String.
	//int n = s.length();
	for(int i = 0; i < n; i++)
	{
		char[] temp = new char[n - i + 1];
		int tempindex = 0;
		
		for(int j = i; j < n; j++)
		{
			temp[tempindex++] = s.charAt(j);
			temp[tempindex] = '\0';
			System.out.println(temp);
		}
	}

	String st = "ee";
	System.out.println(s.contains("ee"));
}

// Driver code
public static void main(String[] args)
{
	String s = "Geekyeeky";
	
	printAllSubStrings(s, s.length());
}
}

// This code is contributed by avanitrachhadiya2155
