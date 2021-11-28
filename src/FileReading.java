// Java program to illustrate
// FileNotFoundException

// All output and input streams
// are available in java.io package
import java.io.*;

public class FileReading
{
public static void main(String[] args) throws IOException
{
		
	// creating object of FileReader
	FileReader reader = new FileReader("C:/Users/sarat/OneDrive/Desktop/text.txt");
	
	// passing FileReader to
	// buffered reader
	BufferedReader br = new BufferedReader(reader);
	
	// declaring empty string
	String data =null;
	
	// while loop to read data
	// and printing them
	while ((data = br.readLine()) != null)
	{
		System.out.println(data);
	}
	
	// closing the object
	br.close();
}
}
